package Combinations;

import java.util.Arrays;

public class PrimeNumbersUptoN {

    public static void printAllPrimeNumbers(int n){
        boolean [] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for(int i=2;i<n;i++){
            for(int j=i*i;j<=n;j+=i){
                if(j<=n && arr[j]==true){
                    arr[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(arr[i]==true){
                System.out.print(i+" --> ");
            }

        }
    }

    public static void main(String[] args) {
        printAllPrimeNumbers(40);
    }
}
