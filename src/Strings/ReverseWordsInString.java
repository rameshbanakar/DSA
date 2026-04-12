package Strings;

public class ReverseWordsInString {
    public static String reverseString(String s){
        StringBuilder ans=new StringBuilder();
        int p1=s.length()-1;
        int p2=s.length();

        while(p1>=0){
            if(p1==0){
                ans.append(" ");
                ans.append(s.substring(p1,p2));
            }
            if(s.charAt(p1)==' '){
                ans.append(s.substring(p1,p2));
                p2=p1;
            }

            p1--;
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s="Hello world my name is Ramesh";

        String ans=reverseString(s);
        System.out.println(ans);
    }
}
