package Recursion;

public class PrintArrayUsingRecursion {
    public static void printArray(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(arr,index+1);

    }
    public static void main(String[] args) {
        int arr[]={2,2,1,-3,4,3,1,-2,-3,2};
        printArray(arr,0);
    }
}
