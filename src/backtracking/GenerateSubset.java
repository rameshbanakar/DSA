package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateSubset {
    public static void generateSubset(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> curr,int index){
         if(index==arr.size()){
             result.add(new ArrayList<>(curr));
             return;
         }
         curr.add(arr.get(index));
         generateSubset(arr,result,curr,index+1);
         curr.remove(curr.size()-1);
         generateSubset(arr,result,curr,index+1);

    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();

        int index=0;
        generateSubset(arr,result,current,index);
        return result;

    }
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        ArrayList<ArrayList<Integer>> ans=solve(arr);

        for(ArrayList<Integer> each:ans){
            System.out.println(each);
        }


    }
}
