package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class generateString {
    public static void generateString(String s,String ans,ArrayList<String> result,boolean vis[]){

        if(ans.length()==s.length()){
            result.add(ans);
        }
        for(int i=0;i<s.length();i++){
            if(vis[i]==false){
                vis[i]=true;
                ans+=String.valueOf(s.charAt(i));
                generateString(s,ans,result,vis);

                vis[i]=false;
                ans=ans.substring(0,ans.length()-1);
            }
        }


    }
    public static ArrayList<String> solve(String s){
        ArrayList<String> result=new ArrayList<>();
        boolean vis[]=new boolean[s.length()];
        Arrays.fill(vis,false);
        generateString(s,"",result,vis);

        return result;

    }
    public static void main(String[] args) {
        String s="ABCD";
        ArrayList<String> ans=solve(s);

        for(String each:ans){
            System.out.println(each);
        }
    }
}
