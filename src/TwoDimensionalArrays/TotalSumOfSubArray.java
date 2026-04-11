package TwoDimensionalArrays;

public class TotalSumOfSubArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int totalSum=0;
        int m=matrix.length;
        int n= matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int tl=(i+1)*(j+1);
                int br=(m-i)*(n-j);
                totalSum+=matrix[i][j]*tl*br;
            }
        }
        System.out.println(totalSum);
    }
}
