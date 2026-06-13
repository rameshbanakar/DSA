package Heap;

import java.util.ArrayList;

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

    }
}
