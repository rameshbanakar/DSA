package DynamicProgramming;

import java.util.Arrays;

public class FibSeries {
    public static int fib(int n, int[] dp) {
        if (n <= 1) return dp[n] = n;

        if (dp[n] != -1) return dp[n];
        int ans = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n] = ans;

    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n + 1];

        Arrays.fill(arr, -1);

        int ans = fib(n, arr);
        System.out.println(ans);

    }
}
