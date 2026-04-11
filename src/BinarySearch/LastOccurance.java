package BinarySearch;

public class LastOccurance {
    public static int lastOccuranceOfNumber(int [] arr,int target){
        int l=0;
        int r=arr.length-1;
        int index = 0;
        while(l<=r){
            int m=(l+r)/2;
            int n=arr[m];
            if(n==target){
                l=m+1;
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
        int find=lastOccuranceOfNumber(arr,2);
        System.out.println("fisrt occurance of the element:"+find);
    }
}
