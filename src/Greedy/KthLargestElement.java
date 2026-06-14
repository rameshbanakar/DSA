package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findSmallElement(ArrayList<Integer> arr, int k) {
        PriorityQueue<Integer> maxpriority = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.size(); i++) {
            maxpriority.add(arr.get(i));
        }

        for (int i = 0; i < k - 1; i++) {
            maxpriority.remove();
        }
        return maxpriority.peek();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8, 5, 1, 2, 4, 9, 7));
        int k = 3;
        int ans = findSmallElement(arr, k);
        System.out.println(ans);


    }
}
