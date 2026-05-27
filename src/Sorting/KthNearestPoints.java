package Sorting;

import java.util.Arrays;

public class KthNearestPoints {
    public static int [][] closestPointsToOrigin(int [][] points,int k){
        Arrays.sort(points,(a,b)->
                (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])
        );
        return Arrays.copyOf(points,k);
    }
    public static void main(String[] args) {
        int[][] points = {{1,3}, {-2,2}, {5,8}, {0,1}};
        int k = 2;
        int [][] res=closestPointsToOrigin(points,k);
        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }
}
