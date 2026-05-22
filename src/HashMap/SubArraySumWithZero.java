package HashMap;

import java.util.HashSet;

public class SubArraySumWithZero {
    public static boolean subArraySum(int arr[]){
        int [] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) return true;
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        HashSet<Integer> repeatedIntegers=new HashSet<>();
        for(int i=0;i<prefixSum.length;i++){
            if(repeatedIntegers.contains(prefixSum[i])){
                return true;
            }
            repeatedIntegers.add(prefixSum[i]);
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={2,2,1,-3,4,3,1,-2,-3,2};
        System.out.println(subArraySum(arr));

    }
}
