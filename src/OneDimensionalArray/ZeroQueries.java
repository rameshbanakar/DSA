package OneDimensionalArray;

public class ZeroQueries {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int queries[][]={{1,3},{5,7},{7,10}};

        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int value=queries[i][1];
            arr[start]=value;
        }
        int modified[]=new int[arr.length];
        modified[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            modified[i]=modified[i-1]+arr[i];
        }
        for(int i=0;i< modified.length;i++){
            System.out.println(modified[i]);
        }

    }
}
