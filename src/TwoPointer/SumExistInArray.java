package TwoPointer;

public class SumExistInArray {
    public static boolean sumExist(int arr[],int targetSum){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==targetSum){
                return true;
            }
            if(sum>targetSum){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,18,20,23,30};
        System.out.println(sumExist(arr,40));

    }
}
