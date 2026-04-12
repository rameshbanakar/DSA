package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    public static String commonPrefix(ArrayList<String> s){
        Collections.sort(s);
        int s1=0;
        String lastString=s.get(s.size()-1);
        String firstString=s.get(0);
        int minStringLength=Math.min(lastString.length(),firstString.length());
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<minStringLength;i++){
            if(lastString.charAt(s1)!=firstString.charAt(s1)){
                return firstString.substring(0,s1);
            }
            ans.append(firstString.charAt(s1));
            s1++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>( Arrays.asList("Apple", "App", "Apple"));
        String ans=commonPrefix(s);
        System.out.println(ans);
    }
}
