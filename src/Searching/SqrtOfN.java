package Searching;

public class SqrtOfN {
    public static int findSqrt(int n){
        int start=1;
        int end=n;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=mid*mid;

            if(val==n) return mid;
            if(val<=n) {
                start=mid+1;
                ans=mid;
            }
            if(val>n) end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=36;
        System.out.println(findSqrt(n));

    }
}
