package Searching;

public class AggressiveCows {
    public static boolean checkPossible(int arr[],int dist,int cows){
        int cowsCount=1;
        int lastPos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPos>=dist){
                lastPos=arr[i];
                cowsCount++;
            }
            if(cowsCount==cows) return true;
        }
        return false;
    }
    public static int maxDistBetweenCows(int[] arr,int cows){
        int minDist=1;
        int maxDist=arr[arr.length-1]-arr[0];
        int ans=0;
        while(minDist<=maxDist){
            int mid=minDist+(maxDist-minDist)/2;
            if(checkPossible(arr,mid,cows)){
                ans=mid;
                minDist=mid+1;
            }else{
                maxDist=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={2,6,11,14,19,25,30,39,43};
        int k=4;

        int dist=maxDistBetweenCows(arr,k);

        System.out.println(dist);


    }
}
