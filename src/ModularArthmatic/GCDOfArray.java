package ModularArthmatic;

public class GCDOfArray {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int arr[]={18,6,30,42};
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=gcd(ans,arr[i]);
        }
        System.out.println(ans);

    }
}
