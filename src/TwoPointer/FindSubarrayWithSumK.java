package TwoPointer;

public class FindSubarrayWithSumK {
    public static boolean subArraySum(int arr[],int k){
        int sum=0;
        int n=arr.length;
        int left=0;
        int right=0;

        while(right<n){
           if(sum==k) return true;
           else if (sum>k) {
               sum-=arr[left];
               left++;
               if(left>right){
                   break;
               }

           }else{
               sum+=arr[right];
               right++;
               if(right==n){
                   break;
               }
           }
        }
        return false;
    }

    public static void main(String[] args) {
          int arr[]={1,3,15,10,20,3,23};
        System.out.println(subArraySum(arr,34));
    }
}
