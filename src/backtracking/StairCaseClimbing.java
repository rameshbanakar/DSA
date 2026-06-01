package backtracking;

import java.util.ArrayList;

public class StairCaseClimbing {
    public static void climb(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> curr,int A){
        if(A<0) return;
        if(A==0){
            result.add(new ArrayList<>(curr));
            return;
        }

        curr.add(1);
        climb(result,curr,A-1);

        curr.remove(curr.size()-1);

        curr.add(2);
        climb(result,curr,A-2);
        curr.remove(curr.size()-1);

    }
    public static ArrayList<ArrayList<Integer>> solve(int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        climb(ans,curr,n);
        return ans;


    }
    public static void main(String[] args) {
        int A=4;
        ArrayList<ArrayList<Integer>> result=solve(A);
        for(ArrayList<Integer> each:result){
            System.out.println(each);
        }
    }
}
