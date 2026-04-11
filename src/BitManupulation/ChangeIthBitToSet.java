package BitManupulation;

import java.util.Scanner;

public class ChangeIthBitToSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if((n&(1<<3))!=0){
            System.out.println("Ith bit is set");
        }else{
            n=n^(1<<3);
        }
        System.out.println(n);
    }

}
