package Sorting;

import java.util.Arrays;

public class MergingTwoSortedArrays {
   public static int[] mergingArray(int [] arr1,int arr2[]){
       int m= arr1.length;
       int n=arr2.length;
       if(m==0 && n==0){
           return  new int [0];
       }
       if(n==0) return arr1;
       if(m==0) return arr2;

       int merged[]=new int[m+n];
       int i=0;
       int j=0;
       int index=0;
       while(i<m && j<n){
           if(arr1[i]<arr2[j]){
               merged[index]=arr1[i];
               i++;
           }else{
               merged[index]=arr2[j];
               j++;
           }
           index++;
       }

       while(i<m){
           merged[index]=arr1[i];
           i++;
           index++;
       }

       while(j<n){
           merged[index]=arr2[j];
           j++;
           index++;
       }
       return merged;
   }

    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11,13};
        int arr2[]={2,4,6};

        int res[]=mergingArray(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
