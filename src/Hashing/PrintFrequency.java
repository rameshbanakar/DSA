package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintFrequency {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8));
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int each : arr) {
            if (hm.containsKey(each)) {
                hm.put(each, hm.get(each) + 1);
            } else {
                hm.put(each, 1);
            }
        }
        System.out.println(hm);
    }
}
