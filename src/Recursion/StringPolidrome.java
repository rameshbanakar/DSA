package Recursion;

public class StringPolidrome {
    public static boolean findPolidrome(String s,int start,int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return findPolidrome(s,start+1,end-1);

    }
    public static void main(String[] args) {
        String s="abccbaa";
        System.out.println(findPolidrome(s,0,s.length()-1));
    }
}
