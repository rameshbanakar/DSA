
// given a no N check if it is prime or not

package Combinations;

public class CheckPrime {

    public static boolean chekPrime(int n){

        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                if(i==n/i) count++;
                else count+=2;
            }
        }

        return count<=2;

    }

    public static void main(String[] args) {
        System.out.println("Given Number is prime or not: "+chekPrime(7));
    }
}
