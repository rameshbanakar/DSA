package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class orange {
    int row;
    int col;
    int mintime;

    orange(int row, int col, int mintime) {
        this.row = row;
        this.col = col;
        this.mintime = mintime;
    }
}

public class RottenOranges {
    public static int minTime(int mat[][]) {
        Queue<orange> q = new LinkedList<>();

        int mintime = 0;
        int fresh = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 2) q.add(new orange(i, j, 0));
                else if (mat[i][j] == 1) fresh++;
            }
        }
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, -1, 0, 1};

        while (!q.isEmpty()) {
            orange rem = q.remove();

            mintime = rem.mintime;
            int nr = rem.row;
            int nc = rem.col;

            for (int d = 0; d < 4; d++) {
                int row = nr + dr[d];
                int col = nc + dc[d];

                if (row >= 0 && row < mat.length && col >= 0 && col < mat[0].length && mat[row][col] == 1) {
                    mat[row][col] = 2;
                    q.add(new orange(row, col, mintime + 1));
                    fresh--;

                }
            }
        }

        return fresh == 0 ? mintime : -1;

    }

    public static void main(String[] args) {
        int[][] mat = new int[5][5];

        for (int i = 0; i < 5; i++) {
            Arrays.fill(mat[i], 1);
        }
        mat[0][3] = 2;
        mat[2][1] = 2;
        mat[4][3] = 2;

        mat[0][1] = 0;
        mat[2][0] = 0;
        mat[2][2] = 0;
        mat[2][4] = 0;
        mat[3][0] = 0;


        System.out.println(minTime(mat));
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
