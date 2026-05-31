package Combinations;

public class SamllPrimeFactors {
    public static void smallPrimeFactors(int n){
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=i;
        }

        for(int i=2;i<=n;i++){
            if(arr[i]==i){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=i;
                }
            }
        }

        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" --> ");
        }
    }
    public static void main(String[] args) {
        int n=40;
        smallPrimeFactors(n);

    }
}
