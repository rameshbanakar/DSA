package OneDimensionalArray;

public class MaxSubArraySum {
    public static int maxSum(int[] arr){
        int max=Integer.MIN_VALUE;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=arr[i];
            }
            max=Math.max(sum,max);
        }
        return max;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,5,-9,-9,2,3,5};
        System.out.println(maxSum(arr));
    }
}
