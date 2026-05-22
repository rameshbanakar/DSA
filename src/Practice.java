import java.util.Arrays;
import java.util.HashSet;

public class Practice {
    public static int longestSubstring(String s){
        int n=s.length();
        int maxLength=Integer.MIN_VALUE;

        int start=0,end=0;
        HashSet<Character> hs=new HashSet<>();
        while(end<n){
            char ch=s.charAt(end);
            while(hs.contains(ch)){
                hs.remove(ch);
                start++;
            }
            hs.add(ch);
            maxLength=Math.max(maxLength,end-start+1);
            end++;

        }
        return maxLength;

    }

    public static void main(String[] args) {
       String s="abcabcbb";
        System.out.println(longestSubstring(s));

    }
}
