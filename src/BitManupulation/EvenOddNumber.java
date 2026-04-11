package BitManupulation;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if((n&1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
