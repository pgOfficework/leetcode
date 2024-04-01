import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Solution {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjacentNodes, int startingNode) {
    	Queue<Integer> queueForNodes = new LinkedList<Integer>();
        ArrayList<Integer> shortestDistanceFromStartingNode = new ArrayList<Integer>(adjacentNodes.size());
        for (int i = 0; i < adjacentNodes.size(); i++) {
            shortestDistanceFromStartingNode.add(0);
        }
        queueForNodes.add(startingNode);

        while (queueForNodes.size() > 0) {
            int currentNode = queueForNodes.poll();
            ArrayList<Integer> tmp = adjacentNodes.get(currentNode);
            for (int i = 0; i < tmp.size(); i++) {
                int v = tmp.get(i);
                if (shortestDistanceFromStartingNode.get(v) == 0) {
                	queueForNodes.add(v);
                    shortestDistanceFromStartingNode.set(v, shortestDistanceFromStartingNode.get(currentNode) + 6);
                }
            }
        }

        return shortestDistanceFromStartingNode;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        System.out.println("q :" +q);
        for(int a0 = 0; a0 < q; a0++){
        	
            int n = input.nextInt();
            System.out.println("in for a0 : " +a0);
            System.out.println("in for n : " +n);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());
            }

            int m = input.nextInt();
            System.out.println("in for m : " +m);
            for(int a1 = 0; a1 < m; a1++){
            	System.out.println("in for for a1 : " +a1);
                int u = input.nextInt() - 1;
                int v = input.nextInt() - 1;
                // First
                ArrayList<Integer> tmp = adj.get(u);
                tmp.add(v);
                adj.set(u, tmp);

                // Second
                tmp = adj.get(v);
                tmp.add(u);
                adj.set(v, tmp);
            }

            int s = input.nextInt() - 1;

            ArrayList<Integer> shortestDistanceFromStartingNode = Solution.bfs(adj, s);

            for (int i = 0; i < n; i++) {
                if (i != s) {
                    if (shortestDistanceFromStartingNode.get(i) == 0) {
                        System.out.print("-1 ");
                    } else {
                        System.out.print(shortestDistanceFromStartingNode.get(i) + " ");
                    }
                }
            }
            System.out.print("\n");
        }
        input.close();
    }
}