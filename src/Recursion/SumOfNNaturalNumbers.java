package Recursion;

public class SumOfNNaturalNumbers {
    public static int findSum(int n,int sum){
        if(n==0){
            return sum;
        }
        sum+=n;
        return findSum(n-1,sum);
    }
    public static void main(String[] args) {
        int sum=0;
        int n=3;
        System.out.println(findSum(n,sum));
    }
}
