package Heap;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class HeapImplementation {
    public static void upHepefy(ArrayList<Integer> heap, int value) {
        heap.add(value);
        int i = heap.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(parent) > heap.get(i)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(parent));
                heap.set(parent, temp);
                i = parent;
            } else {
                break;
            }
        }
    }

    public static void downheapify(ArrayList<Integer> heap, int value) {
        heap.add(value);

        int i = 0;

        while (2 * i + 1 < heap.size()) {
            int child1 = heap.get(2 * i + 1);
            int child2 = heap.get(2 * i + 2);
            int min = IntStream.of(heap.get(i), child1, child2).min().getAsInt();
            if (min == heap.get(i)) return;
            else if (min == child1) {
                int temp = heap.get(i);
                heap.set(i, child1);
                heap.set(2 * i + 1, temp);
                i = 2 * i + 1;
            } else if (min == child2) {
                int temp = heap.get(i);
                heap.set(i, child2);
                heap.set(2 * i + 2, temp);
                i = 2 * i + 2;
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        upHepefy(heap, 10);
        System.out.println(heap);
        upHepefy(heap, 4);
        System.out.println(heap);
        upHepefy(heap, 9);
        System.out.println(heap);

        downheapify(heap, 20);
        System.out.println(heap);

    }
}
