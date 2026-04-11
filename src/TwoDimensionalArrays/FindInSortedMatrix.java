package TwoDimensionalArrays;

public class FindInSortedMatrix {
    public static boolean findValue(int [][] matrix,int target){
        int i=0;
        int j=matrix[0].length-1;

        while(i>=0 && j<matrix[0].length){
            int val=matrix[i][j];

            if(val==target) return true;
            else{
                if(val>target) j--;
                else i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findValue(matrix,22));

    }

}
