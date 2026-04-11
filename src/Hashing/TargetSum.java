package Hashing;

import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8));
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();

        HashSet<Integer> hs=new HashSet<>();

        for(int each:arr){
            int rem=target-each;
            if(hs.contains(rem)){
                System.out.println("pair exist");
                break;
            }else{
                hs.add(each);
            }
        }
    }
}
