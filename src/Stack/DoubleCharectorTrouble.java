package Stack;

import java.util.Stack;

public class DoubleCharectorTrouble {
    public static String doubleCharsRemove(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek()!=ch){
                stack.push(ch);
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            char ch=stack.pop();
            ans=ch+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abbccddf";
        String ans=doubleCharsRemove(str);
        System.out.println(ans);
    }
}
