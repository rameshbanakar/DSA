package Combinations;

import java.util.Arrays;

public class SamllPrimeFactors {
    public static void smallPrimeFactors(int n){
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int n=40;
        smallPrimeFactors(n);

    }
}
