package BitManupulation;

public class findUniqueNumberEachElementThreeTimes {
    public static int findUniqueElement(int arr[]){
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if((arr[j]&(1<<i))>0){
                    count++;
                }
            }
            if(count%3>0){
                ans=ans^(1<<i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,4,1,2,3,4};
        System.out.println(findUniqueElement(arr));

    }
}
