package HashMap;

import java.util.HashMap;

public class LargestSubarrayWithSumK {
    public static int longestSubArray(int [] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=i+1;
            }
            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 6;
        int l=longestSubArray(arr,k);
        System.out.println("Length of the array:"+l);
    }
}
