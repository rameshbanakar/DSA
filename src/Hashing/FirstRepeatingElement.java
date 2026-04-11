package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,1,2,3));
        HashSet<Integer> hs=new HashSet<>();
        for(int each:arr){
            if(hs.contains(each)){
                System.out.println(each+" is the first repeating element");
                break;
            }
            hs.add(each);
        }
    }
}
