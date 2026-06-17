package DynamicProgramming;

import java.util.Arrays;

public class NumberOfWays {
    public static int topDownApproach(int m, int n, int i, int j, int[][] dp) {
        if (i == m - 1 && j == n - 1) return dp[i][j] = 1;

        if (i >= m || j >= n) return 0;

        if (dp[i][j] != 0) return dp[i][j];

        int ans = topDownApproach(m, n, i + 1, j, dp) + topDownApproach(m, n, i, j + 1, dp);

        return dp[i][j] = ans;

    }

    public static int topDownApproachCalling(int m, int n) {
        int dp[][] = new int[m][n];
        for (int[] each : dp) {
            Arrays.fill(each, 0);
        }

        topDownApproach(m, n, 0, 0, dp);
        for (int[] each : dp) {
            System.out.println(Arrays.toString(each));
        }
        return 0;


    }

    public static int bottomUpApproach(int m, int n) {
        int dp[][] = new int[m][n];
        for (int[] each : dp) {
            Arrays.fill(each, 0);
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 || j == n - 1) dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }

            }
        }
        for (int[] each : dp) {
            System.out.println(Arrays.toString(each));
        }
        return dp[0][0];


    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
//        System.out.println(bottomUpApproach(m,n));

        System.out.println(topDownApproachCalling(m, n));

    }
}
