import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Node implements Comparable<Node> {
	private String name;
	private Integer distance = Integer.MAX_VALUE;
	private List<Node> shortestPath = new LinkedList<>();
	private Map<Node, Integer> adjacentNode = new HashMap<>();

	public void addjacentNode(Node node, int weight) {
		adjacentNode.put(node, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node(String name) {
		super();
		this.name = name;
	}

	public Integer getDistance() {
		return distance;
	}

	public List<Node> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Node> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public Map<Node, Integer> getAdjacentNode() {
		return adjacentNode;
	}

	public void setAdjacentNode(Map<Node, Integer> adjacentNode) {
		this.adjacentNode = adjacentNode;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Node node) {
		return Integer.compare(this.distance, node.getDistance());
	}

}

public class DijkstraAlgorithm {

	public void calculateShortestyPath(Node source) {
		source.setDistance(0);
		Set<Node> settledNode = new HashSet<>();
		Queue<Node> unsettledNode = new PriorityQueue<>(Collections.singleton(source));

		while (!unsettledNode.isEmpty()) {

			Node currentNode = unsettledNode.poll();
			currentNode.getAdjacentNode().entrySet().stream().filter(entry -> !settledNode.contains(entry.getKey()))
					.forEach(entry -> {
						evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
						unsettledNode.add(entry.getKey());
					});
			settledNode.add(currentNode);

		}
	}

	private void evaluateDistanceAndPath(Node adjacentNode, Integer edgeWeight, Node sourceNode) {
		Integer newDistance = sourceNode.getDistance() + edgeWeight;

		if (newDistance < adjacentNode.getDistance()) {

			adjacentNode.setDistance(newDistance);

			adjacentNode.setShortestPath(Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode))
					.collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
		}
	}

	public void printPaths(List<Node> node) {
		node.forEach(n -> {
			String path = n.getShortestPath().stream().map(Node::getName).collect(Collectors.joining("->"));
			System.out.println(path.isEmpty() ? n.getName() + " : " + n.getDistance()
					: path + " -> " + n.getName() + " : " + n.getDistance());
		});

	}

	public static void main(String[] args) {
		DijkstraAlgorithm d = new DijkstraAlgorithm();

		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");

		nodeA.addjacentNode(nodeB, 2);
		nodeA.addjacentNode(nodeC, 4);

		nodeB.addjacentNode(nodeC, 3);
		nodeB.addjacentNode(nodeD, 1);
		nodeB.addjacentNode(nodeE, 5);

		nodeC.addjacentNode(nodeD, 2);

		nodeD.addjacentNode(nodeE, 1);
		nodeD.addjacentNode(nodeF, 4);

		nodeE.addjacentNode(nodeF, 2);

		d.calculateShortestyPath(nodeA);

		d.printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));

	}

}
