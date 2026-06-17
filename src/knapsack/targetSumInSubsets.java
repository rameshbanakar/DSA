package knapsack;

public class targetSumInSubsets {

    public static boolean targetSum(int[] arr, int index, int target) {
        if (target == 0) return true;

        if (index >= arr.length) return false;
        boolean pick = false;
        if (arr[index] <= target) {
            pick = targetSum(arr, index + 1, target - arr[index]);
        }
        boolean unpick = targetSum(arr, index + 1, target);

        return pick || unpick;
    }

    //    top down approch
    public static int targetSumTopdown(int[] arr, int index, int target) {
        return 1;
    }

    //
    public static void main(String[] args) {
        int a[] = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println(targetSum(a, 0, target));


    }
}
