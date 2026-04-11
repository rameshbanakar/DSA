package Hashing;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str="abcabcdbb";
        int longestString=0;
        int s=0,e=0;
        HashSet<Character> hs=new HashSet<>();
        int n=str.length();
        while(e<n){
            char ch=str.charAt(e);
            if(hs.contains(ch)){
                hs.remove(ch);
                s++;
            }
            hs.add(ch);
            longestString=Math.max(longestString,e-s+1);
            e++;
        }
        System.out.println(longestString);

    }
}
