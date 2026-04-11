package OneDimensionalArray;

public class FirstMissingNaturalNumber {
    public static int findNaturalMissingNumber(int [] arr){
        int n=arr.length;
//      replace the all negetive numbers with n+2
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=n+2;
            }
        }

        for(int i=0;i<n;i++){
            int ele=Math.abs(arr[i]);
            if(ele>=1 && ele<=n){
                arr[ele-1]=arr[ele-1]*-1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;

    }
    public static void main(String[] args) {
        int arr[]={5,3,1,-1,-2,-4,7,2};
        int ret=findNaturalMissingNumber(arr);
        System.out.println(ret);


    }
}
