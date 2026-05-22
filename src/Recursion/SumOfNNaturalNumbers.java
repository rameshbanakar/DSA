package Recursion;

public class SumOfNNaturalNumbers {
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        return findSum(n-1)+n;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(findSum(n));
    }
}
