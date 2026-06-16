package Greedy;

public class CandyDistribution {
    public static int minChocolatesRequired(int[] marks) {
        int n = marks.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (marks[i] > marks[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }

        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (marks[i] > marks[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }

        }
        int chochos = 0;
        for (int i = 0; i < n; i++) {
            chochos += Math.max(left[i], right[i]);
        }
        return chochos;
    }

    public static void main(String[] args) {
        int marks[] = {1, 6, 3, 1, 10, 12, 20, 5, 2};
        int minChocos = minChocolatesRequired(marks);
        System.out.println(minChocos);

    }
}
