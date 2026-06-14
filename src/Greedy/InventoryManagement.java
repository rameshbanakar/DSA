package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class logic implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}

public class InventoryManagement {

    public static int solve(int[] a, int[] b) {
        int n = a.length;
        int c[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            c[i][0] = a[i];
            c[i][1] = b[i];

        }
        Arrays.sort(c, new logic());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int time = 0;

        for (int i = 0; i < n; i++) {
            if (time < c[i][0]) {
                pq.add(c[i][1]);
                time++;
            } else {
                if (pq.peek() < c[i][1]) {
                    pq.remove();
                    pq.add(c[i][1]);
                }
            }

        }

        int ans = 0;

        while (!pq.isEmpty()) {
            ans += pq.remove();
        }
        return ans;


    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 3, 5, 5, 5, 8};
        int[] b = {5, 2, 7, 1, 4, 3, 8, 1};
        System.out.println(solve(a, b));

    }
}
