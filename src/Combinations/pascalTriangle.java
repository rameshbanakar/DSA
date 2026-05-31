package Combinations;

import java.util.Arrays;

public class pascalTriangle {
    public static int [][] pascaltriangle(int n){
        int [][] ans=new int[n][n];
        ans[0][0]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==i){
                    ans[i][j]=1;
                }else {
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=5;
        int res[][]=pascaltriangle(n);
        for(int [] each:res){
            System.out.println(Arrays.toString(each));
        }

    }
}
