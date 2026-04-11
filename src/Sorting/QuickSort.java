package Sorting;

public class QuickSort {
    public static void quickSort(int arr [],int left,int right){
        if(left>right) return;

        int partition=partition(arr,left,right);
        quickSort(arr,left,partition-1);
        quickSort(arr,partition+1,right);

    }
    public static int  partition(int arr[],int left,int right) {
        int pivot = arr[right]; // choose last element as pivot
        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
        public static void main (String[]args){
            int[] arr = {5, 3, 8, 4, 2, 7, 1};

            quickSort(arr, 0, arr.length - 1);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
