package Searching;

public class BinarySearching {
    public static boolean findElement(int [] arr,int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14};
        System.out.println(findElement(arr,10));
    }
}
