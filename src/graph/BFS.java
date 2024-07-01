package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int v = 5;
        int source = 0;

        Graph graph = new Graph(v);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2, 4);

        System.out.println(graph);

        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.offer(source);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int val : graph.adjacencyList[u]) {
                if (!visited[val]) {
                    visited[val] = true;
                    q.offer(val);
                }
            }
        }
    }

}
