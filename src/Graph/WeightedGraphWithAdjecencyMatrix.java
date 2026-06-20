package Graph;

import java.util.Arrays;

public class WeightedGraphWithAdjecencyMatrix {
    public static void main(String[] args) {
        int edges[][] = {{0, 1, 10}, {0, 2, 20}, {1, 2, 30}, {2, 3, 40}, {3, 1, 50}};

        int[][] graph = new int[4][4];
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            int weight = edges[i][2];
            graph[row][col] = weight;
            graph[col][row] = weight;

        }

        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }
    }
}
