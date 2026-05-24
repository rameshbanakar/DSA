import java.util.Arrays;

public class Practice {
   public static int[] sortColor(int [] arr){
       int l=0;
       int r=arr.length-1;
       int index=0;

       while(index<=r){

           int val=arr[index];
           if(index==l && val==0){
               index++;
               continue;
           }

           if(val==0){

               arr[index]=arr[l];
               arr[l]=0;
               l++;
           } else if (val==2) {
               arr[index]=arr[r];
               arr[r]=2;
               r--;

           }else{
               index++;
           }
       }
       return arr;
   }

    public static void main(String[] args) {
        int arr[]={2,0,2,1,2,0};
        int [] res=sortColor(arr);
        System.out.println(Arrays.toString(res));

    }
}
