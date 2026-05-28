import java.util.Arrays;
import java.util.Stack;

public class Practice {
   public static boolean balenced(String s){
       Stack<Character> stack=new Stack<>();

       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);

           if(ch=='{' || ch=='(' || ch=='['){
               stack.add(ch);
           }else if(ch=='}' || ch==']' || ch==')'){
               char peak=stack.peek();
               if(ch=='}' && peak=='{'){
                   stack.pop();
               }else if(ch==')' && peak=='('){
                   stack.pop();
               } else if (ch==']' && peak=='[') {
                   stack.pop();
               }else{
                   return false;
               }
           }
       }
       if(stack.isEmpty()) return true;
       else return false;
   }

    public static void main(String[] args) {
        String s="{()}{";
        System.out.println(balenced(s));

    }
}
