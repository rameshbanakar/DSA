package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MeadianOfArray {

    public static void balence(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.size() > minHeap.size()) {
            minHeap.add(maxHeap.remove());
        } else {
            maxHeap.add(minHeap.remove());
        }
    }

    public static double meadianNumber(ArrayList<Integer> arr) {
        if (arr.size() == 0) return 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        maxHeap.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > maxHeap.peek()) minHeap.add(num);
            else maxHeap.add(num);

            int diff = Math.abs(maxHeap.size() - minHeap.size());

            if (diff > 1) {
                balence(maxHeap, minHeap);
            }
        }
        if (minHeap.size() > maxHeap.size()) return maxHeap.peek();
        else if (minHeap.size() < maxHeap.size()) return minHeap.peek();
        else {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(6, 4, 12, 3, 7, 10));
        System.out.println(meadianNumber(arr));

    }
}
