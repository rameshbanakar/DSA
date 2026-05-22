package Recursion;

public class PrintingNumberInIncreasingOrder {
    public static void printIncreasingOrder(int n){
        if(n==0){
            return;
        }
        printIncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printIncreasingOrder(n);
    }
}
