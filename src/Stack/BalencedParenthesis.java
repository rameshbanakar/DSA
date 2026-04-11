package Stack;

import java.util.Stack;

public class BalencedParenthesis {
    public static boolean checkBalenced(String s){
        Stack<Character> stack=new Stack<>();
        int size=s.length();
        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char peek=stack.peek();
                    if(ch=='}' && peek!='{') return false;
                    if(ch==']' && peek!='[') return false;
                    if(ch==')' && peek!='(') return false;
                    stack.pop();
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="(){[]}";
        boolean varify=checkBalenced(s);
        if(varify){
            System.out.println("Balenced");

        }else{
            System.out.println("Not balcenced");
        }

    }
}
