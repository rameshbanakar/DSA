package BinarySearch;

public class BinarySearch {
    public static boolean findNumberExist(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            int n=arr[m];
            if(n==target){
                return true;
            }else if(n<target){
               l=m+1;
            } else {
               r=m-1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,20};
        boolean find=findNumberExist(arr,11);

        if(find){
            System.out.println("Number found in the Array");
        }else{
            System.out.println("Number not found int the Array");
        }

    }
}
