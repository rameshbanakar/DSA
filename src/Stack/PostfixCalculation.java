package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostfixCalculation {
    public static int calculate(List<String> arr){
        Stack<Integer> stack=new Stack<>();

        int n=arr.size();
        for(int i=0;i<n;i++){
            String ch=arr.get(i);
//            System.out.println(ch);
            if(ch.length()==1 && (ch=="+"||ch=="*"|| ch=="/" || ch=="-")){
                int op1=stack.pop();
                int op2=stack.pop();
                if(ch=="+"){
                    stack.push(op1+op2);
                } else if (ch=="*") {
                    stack.push(op1*op2);

                } else if (ch=="-") {
                    stack.push(op1-op2);

                } else if (ch=="/") {
                    stack.push(op1/op2);
                }
            }else{
                int val=Integer.parseInt(ch);
//                System.out.println(val);
                stack.push(val);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("18","4","2","-","/","6","*","9","+");
        int val=calculate(arr);
        System.out.println(val);
    }
}
