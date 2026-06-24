package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Graph.AdjecencyListGraph.graphCreation;


public class bfsTraversal {
    public static void bfs(ArrayList<pair>[] graph, int index, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(index);

        visited[index] = true;

        while (!q.isEmpty()) {

            int rem = q.remove();
            System.out.println(rem);
            for (pair each : graph[rem]) {
                if (visited[each.val] == false) {
                    q.add(each.val);
                    visited[each.val] = true;
                }
            }

        }

    }

    public static void traversegraph(ArrayList<pair>[] graph) {
        int n = 5;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                bfs(graph, i, visited);
            }

        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1, 10}, {0, 2, 20}, {0, 4, 30}, {2, 3, 40}, {2, 4, 50}};
        int n = 5;
        ArrayList<pair>[] graph = graphCreation(n, edges);
        traversegraph(graph);
    }
}
