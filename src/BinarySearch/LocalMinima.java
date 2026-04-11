package BinarySearch;

public class LocalMinima {
    public static int findLocalMinima(int arr[]){
        int l=arr.length;
        if(l==0) return 0;
        if(l==1 && arr[0]<arr[1]) return arr[0];
        if(arr[l-1]<arr[l-2]) return arr[l-1];

        int low=1;
        int high=l-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                return arr[mid];
            }else if(arr[mid-1]<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,5,4,2,1,3,2,1,10};
        int minima=findLocalMinima(arr);
        System.out.println(minima);
    }
}
