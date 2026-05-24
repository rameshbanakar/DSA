package Sorting;

import java.util.Arrays;

public class BringElementIntoSortedPositions {

    public static int [] rearrange(int [] arr){
         int index=0;
         int pivot=arr[arr.length-1];
         int n=arr.length;
         int storeIndex=0;
         while(index<n-1){
             if(arr[index]<pivot){
                 int temp=arr[storeIndex];
                 arr[storeIndex]=arr[index];
                 arr[index]=temp;
                 storeIndex++;
             }
             index++;
         }
         int temp=arr[arr.length-1];
         arr[arr.length-1]=arr[storeIndex];
         arr[storeIndex]=temp;
         return arr;
    }

    public static void main(String[] args) {
        int arr[]={9,8,1,6,5,11,4,7};
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
