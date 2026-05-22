package Recursion;

public class PowerFunction {
    public static int findPower(int base,int power){
        if(power==0){
            return 1;
        }
        int value=findPower(base,power/2);
        if(power%2==0){
            return value*value;
        }else{
            return value*value*base;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(findPower(n,3));

    }
}
