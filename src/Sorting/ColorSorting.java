package Sorting;

import java.util.Arrays;

public class ColorSorting {
    public static void colorSort(int arr[]) {

        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while(index <= right){

            if(arr[index] == 0){
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;

                left++;
                index++;
            }
            else if(arr[index] == 2){
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;
            }
            else{
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,2,0};
        colorSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
