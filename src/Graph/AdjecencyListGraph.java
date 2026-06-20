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
    public static void main(String[] args) {
        int edges[][] = {{0, 1, 10}, {0, 2, 20}, {1, 2, 30}, {2, 3, 40}, {3, 1, 50}};
        int n = edges.length;
        ArrayList<pair>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            int weight = edges[i][2];
            graph[row].add(new pair(col, weight));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(graph[i]);
        }
    }
}
