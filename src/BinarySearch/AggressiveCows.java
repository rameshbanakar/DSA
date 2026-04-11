package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean checkPossible(int arr[],int mid,int cows){
        int cowCount=1;
        int lastPlaced=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPlaced>=mid){
                lastPlaced=arr[i];
                cowCount+=1;
            }
        }
        return cows==cowCount;
    }
    public static void main(String[] args) {
        int arr[]={2,6,11,14,19,25,30,39,43};
        int cows=4;
        int high = Arrays.stream(arr).max().getAsInt()-Arrays.stream(arr).min().getAsInt();
        int min=1;
        int ans=0;

        while(min<=high){
            int mid=min + (high - min) / 2;;
            System.out.println(mid+" "+high+" "+min);
            if(checkPossible(arr,mid,cows)){
                ans=mid;
                min=mid+1;
            }else {
                high=mid-1;
            }
        }
        System.out.println("Possible maximum distance: "+ans);
    }
}
