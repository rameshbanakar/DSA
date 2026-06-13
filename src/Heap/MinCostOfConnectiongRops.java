//given an array that represents the length of each rope so need to find the minimum cost of connecting all rops
//sum of connecting ropes length will be cost of connecting

package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostOfConnectiongRops {
    public static int findMinimumCost(ArrayList<Integer> arr) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        for (int each : arr) {
            minpq.add(each);
        }

        while (minpq.size() > 1) {
            int num1 = minpq.remove();
            int num2 = minpq.remove();
            int sum = num1 + num2;
            minpq.add(sum);

        }
        return minpq.remove();

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 2, 6, 3));
        System.out.println(findMinimumCost(arr));
    }
}
