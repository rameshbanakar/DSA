package Graph;

import java.util.ArrayList;

class pair {
    int val;
    int weight;

    pair(int val, int weight) {
        this.val = val;
        this.weight = weight;
    }
}

public class AdjecencyListGraph {
    public static ArrayList<pair>[] graphCreation(int n, int edges[][]) {
        ArrayList<pair>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            int weight = edges[i][2];
            graph[row].add(new pair(col, weight));
            graph[col].add(new pair(row, weight));
        }
        return graph;
    }
    public static void main(String[] args) {
        int edges[][] = {{0, 1, 10}, {0, 2, 20}, {1, 2, 30}, {2, 3, 40}, {3, 1, 50}};
        int node = edges.length;
        ArrayList<pair>[] graph = graphCreation(node, edges);
        for (int i = 0; i < 4; i++) {
            System.out.println(graph[i]);
        }
    }
}
