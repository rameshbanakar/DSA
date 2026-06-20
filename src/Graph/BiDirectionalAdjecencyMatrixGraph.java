package Graph;

import java.util.Arrays;

public class BiDirectionalAdjecencyMatrixGraph {
    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}, {3, 1}};

        int[][] graph = new int[4][4];
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            graph[row][col] = 1;
            graph[col][row] = 1;

        }

        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }
    }
}
