package OneDimensionalArray;


public class RainWaterTrapping {
    public static int waterTrapped(int [] arr){
        int n=arr.length;
        int leftMax[]=new int [n];
        int rightMax[]=new int[n];

        int leftmaxInt=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            leftmaxInt=Math.max(leftmaxInt,arr[i]);
            leftMax[i]=leftmaxInt;
        }

        int rightmaxInt=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            rightmaxInt=Math.max(rightmaxInt,arr[i]);

            rightMax[i]=rightmaxInt;
        }
        int waterTrapped=0;
        for(int i=0;i<n;i++){
             int leftHeight=leftMax[i];
             int rightHeight=rightMax[i];
             int minHeight=Math.min(leftHeight,rightHeight);
             int water=minHeight-arr[i];
             waterTrapped+=water;

        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,4,3,2,7};
        int waterStored=waterTrapped(arr);
        System.out.println("Total water trapped:"+waterStored);
    }
}
