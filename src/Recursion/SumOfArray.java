package Recursion;

public class SumOfArray {
    public static int findSumOfArray(int arr[],int sum,int index){
        if(index==arr.length){
            return sum;
        }
        sum+=arr[index];
        return findSumOfArray(arr,sum,index+1);
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,-3,4,3,1,-2,-3,2};
        System.out.println(findSumOfArray(arr,0,0));

    }
}
