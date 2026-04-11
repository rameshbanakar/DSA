package BinarySearch;

public class FirstOccurance {
    public static int firstOccuranceNumber(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        int index = 0;
        while(l<=r){
            int m=(l+r)/2;
            int n=arr[m];
            if(n==target){
                r=m-1;
                index=m;
            }else if(n<target){
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,7,8,9,20};
        int find=firstOccuranceNumber(arr,2);
        System.out.println("fisrt occurance of the element:"+find);

    }
}
