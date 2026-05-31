package Combinations;

public class CountDivisors {
    public static int countFactors(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                if(i==n/i) count++;
                else count+=2;
            }
        }
        return count;
    }
    public static void countDivisors(int n){
        int arr[]=new int [n+1];

        for(int i=2;i<=n;i++){
            arr[i]=countFactors(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"-->");
        }

    }
    public static void main(String[] args) {
        int n=40;
        countDivisors(n);
    }
}
