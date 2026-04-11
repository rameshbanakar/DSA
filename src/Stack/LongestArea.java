package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LongestArea {
    public static int [] nearestSmallLeft(int[] arr){
        int [] result=new int[arr.length];
        Stack<Integer> small=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
           while(!small.isEmpty() && arr[small.peek()]>=val){
               small.pop();
           }
           if(small.isEmpty()) {
               result[i] = -1;
           }
           else {
               result[i] = small.peek();
           }
           small.push(i);
        }
        return result;
    }
    public static int[] nearestSmallRight(int arr[]){
        int n=arr.length;
        int [] result=new int[n];
        Stack<Integer> small=new Stack<>();
        for(int i=n-1;i>=0;i-- ){
            int val=arr[i];
            while(!small.isEmpty() && arr[small.peek()]>=val){
                small.pop();
            }
            if(small.isEmpty()) {
                result[i] = -1;
            }
            else {
                result[i] = small.peek();
            }
            small.push(i);
        }
        return result;

    }
    public static int largestArea(int []arr,int smallleft[],int smallRight[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int lenght=smallRight[i]-smallleft[i]-1;
            int height=arr[i];
            int area=lenght*height;
            ans=Math.max(ans,area);
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[]={8,6,2,5,6,5,7,4};
        int [] smallerLeftSide=nearestSmallLeft(arr);

        int [] smallerRightSide=nearestSmallRight(arr);

        int ans=largestArea(arr,smallerLeftSide,smallerRightSide);
        System.out.println(ans);

    }
}
