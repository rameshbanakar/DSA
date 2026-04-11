package BinarySearch;

public class Painters {
    public static boolean checkPossible(int arr[],int painters,int mid){
        int countPainters=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                countPainters++;
            }else{
                sum+=arr[i];
            }
        }
        return countPainters<=painters;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int painters=4;
        int ans=0;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if (checkPossible(arr,painters,mid)) {
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);

    }
}
