package Sorting;

import java.util.Arrays;

public class SmallestNumberFormation {
    public static int [] findSmallestNumber(int arr[]){
        int frequency[]=new int[10];

        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            frequency[val]+=1;
        }
        int index=0;
        for(int i=0;i<frequency.length;i++){
            int freq=frequency[i];
            for(int j=0;j<freq;j++){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={6,3,4,2,7,2,1};
        int [] res=findSmallestNumber(arr);
        System.out.println(Arrays.toString(res));

    }
}
