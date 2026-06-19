package knapsack;

public class KnapsackProblem_01 {
    public static int maxValue(int index, int[] value, int[] weight, int cap) {
        if (index >= value.length || cap <= 0) return 0;

        int pick = 0;
        if (weight[index] <= cap) {
            pick = maxValue(index + 1, value, weight, cap - weight[index]) + value[index];
        }
        int notPick = maxValue(index + 1, value, weight, cap);

        return Math.max(pick, notPick);

    }

    public static void main(String[] args) {
        int value[] = {100, 60, 120, 150};
        int weight[] = {20, 10, 30, 40};
        int capacity = 50;

        System.out.println(maxValue(0, value, weight, capacity));

    }
}
