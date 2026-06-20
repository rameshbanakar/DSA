package Graph;

import java.util.ArrayList;
import java.util.Arrays;

import static Graph.AdjecencyListGraph.graphCreation;

public class depthFirstSearch {
    public static void dfs(int index, ArrayList<pair>[] graph, boolean visited[]) {
        visited[index] = true;
        System.out.println(index);

        ArrayList<pair> list = graph[index];

        for (pair each : list) {
            if (visited[each.val] == false) {
                dfs(each.val, graph, visited);
            }
        }
    }

    public static void traversegraph(ArrayList<pair>[] graph) {

        int n = graph.length;
        boolean visisted[] = new boolean[n];
        System.out.println(Arrays.toString(visisted));

        for (int i = 0; i < n; i++) {
            if (visisted[i] == false) {
                dfs(i, graph, visisted);
            }

        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1, 10}, {0, 2, 20}, {1, 2, 30}, {2, 3, 40}, {3, 1, 50}};
        int n = edges.length;
        ArrayList<pair>[] graph = graphCreation(n, edges);
        traversegraph(graph);


    }
}
