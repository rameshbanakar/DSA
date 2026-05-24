package Searching;

public class LastOccurance {
    public static int lastOccuranceIndex(int arr[],int target){
        int start=0;
        int end=arr.length;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                index=mid;
                start=mid+1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={-5,-5,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15};
        System.out.println(lastOccuranceIndex(arr,5));
    }
}
