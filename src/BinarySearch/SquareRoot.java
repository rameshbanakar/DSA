package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static int squareRootOfNumber(int n){
        int l=0;
        int h=n;
        int root = 0;
        while(l<=h){
            int m=l+(h-l)/2;
            int val=m*m;
            if(val==n){
                return m;
            } else if (val>n) {
              h=m-1;
            }else{
                root=m;
                l=m+1;
            }

        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int root=squareRootOfNumber(n);
        System.out.println("Root of "+n+" will be "+root);
    }
}
