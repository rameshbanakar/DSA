package Searching;

public class PainterPartitions {

    public static boolean checkPossible(int arr[],int time,int k){
        int painters=1;//first painter already started to accumulat so start with 1
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>time){
                sum=arr[i];
                painters++;
            }else{
                sum+=arr[i];
            }

        }
        return painters<=k?true:false;
    }

    public static int minTimeRequires(int [] arr,int k){
        int minTime=Integer.MIN_VALUE;
        int maxTime=0;

        for(int i=0;i<arr.length;i++){
            minTime=Math.max(minTime,arr[i]);
            maxTime+=arr[i];
        }
        int ans=0;
        while(minTime<=maxTime){
            int mid=minTime+(maxTime-minTime)/2;

            if(checkPossible(arr,mid,k)){
                ans=mid;
                maxTime=mid-1;
            }else{
                minTime=mid+1;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int [] arr={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int k=4;
        int time=minTimeRequires(arr,k);
        System.out.println(time);


    }
}
