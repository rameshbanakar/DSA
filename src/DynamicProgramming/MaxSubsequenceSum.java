package DynamicProgramming;

import java.util.Arrays;


// recusrion is there so top down approach
public class MaxSubsequenceSum {
    public static int topDownApproach(int arr[], int start, int end, int dp[]) {
        if (start > end) return 0;

        if (dp[start] != Integer.MIN_VALUE) return dp[start];

        int pick = topDownApproach(arr, start + 2, end, dp) + arr[start];
        int noPick = topDownApproach(arr, start + 1, end, dp);

        return dp[start] = Math.max(pick, noPick);

    }

    public static int maxSubsequnce(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int start = 0;
        int end = n - 1;
        return topDownApproach(arr, start, end, dp);

    }

    //  some solution with the bottom up approach
    public static int bottomUpApproach(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n + 1];

        Arrays.fill(dp, 0);

        for (int i = n - 1; i >= 0; i--) {
            if (i + 2 < n) {
                dp[i] = Math.max(arr[i] + dp[i + 2], dp[i + 1]);
            } else {
                dp[i] = Math.max(arr[i] + 0, dp[i + 1]);
            }

        }
        return dp[0];

    }

    public static void main(String[] args) {
        int arr[] = {2, -1, -4, 5, 3, -1, 4, 2};
        System.out.println("topDownApproach " + maxSubsequnce(arr));
        System.out.println("bottomUpApproach " + bottomUpApproach(arr));

    }
}
