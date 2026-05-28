package Searching;

public class FindMinimumInRotatedArray {
    public static int findMinimum(int [] arr){
        int low=0;
        int high=arr.length-1;

        while (low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{

                high=mid;
            }
        }
        return arr[low];

    }
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,1,2,3,4};
        System.out.println(findMinimum(arr));
    }
}
