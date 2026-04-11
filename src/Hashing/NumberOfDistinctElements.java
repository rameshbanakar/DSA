package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NumberOfDistinctElements {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8));
        HashSet<Integer> hs=new HashSet<>();
        for(int each:arr){
            hs.add(each);
        }
        System.out.println("Number of distinct elements: "+hs.size());
    }
}
