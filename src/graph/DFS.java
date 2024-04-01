package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
	
	static Graph graph;

	public static void main(String[] args) {
		int v = 5;
		int source = 0;

		graph = new Graph(v);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		graph.addEdge(2, 4);

		System.out.println(graph);

		boolean[] visited = new boolean[v];
//		Stack<Integer> s = new Stack<>();
//		visited[source] = true;
//		s.push(source);

//		while (!s.isEmpty()) {
//			int u = s.pop();
//			System.out.print(u + " ");
//			for (int val : graph.adjacencyList[u]) {
//				if (!visited[val]) {
//					visited[val] = true;
//					s.push(val);
//				}
//			}
//		}
		dfs(source, visited);
	}
	
	public static void dfs(int s, boolean[] visited) {
		visited[s]=true;
		System.out.print(s + " ");
		for (int w  : graph.adjacencyList[s]) {
			if(!visited[w])
			dfs(w, visited);
		}
	}

}
