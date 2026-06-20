package knapsack;

public class unboundedKnapsack {
    public static int unbound(int index, int cap, int values[], int weight[]) {
        if (index >= values.length) return 0;
        if (cap <= 0) return 0;

        int unpick = unbound(index + 1, cap, values, weight);
        int pick = 0;
        if (weight[index] <= cap) {
            pick = unbound(index, cap - weight[index], values, weight) + values[index];
        }
        return Math.max(pick, unpick);
    }
    public static void main(String[] args) {
        int values[] = {1, 30};
        int weight[] = {1, 50};
        int ans = unbound(0, 100, values, weight);
        System.out.println(ans);

    }
}
