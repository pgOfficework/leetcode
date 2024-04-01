package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	// Adjacency Matrix
//	private int adjacencyMatrix[][];
//
//	public Graph(int v, int u) {
//		this.adjacencyMatrix = new int[v][v];
//	}
//
//	public void addEdges(int v, int e) {
//		this.adjacencyMatrix[v][e] = 1;
//		this.adjacencyMatrix[e][v] = 1;
//	}

	// Adjacency List
	 LinkedList<Integer>[] adjacencyList;
	private int v;
	private int e;

	public Graph(int V) {
		this.v = V;
		this.e = 0;
		this.adjacencyList = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			this.adjacencyList[i] = new LinkedList<>();
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(v + " vertices, " + e + " edges " + "\n");
		for (int v = 0; v < v; v++) {
			sb.append(v + ": ");
			for (int w : adjacencyList[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public void addEdge(int v, int u) {
		adjacencyList[u].add(v);
		adjacencyList[v].add(u);
		e++;
	}
}
