package Stack;

import java.util.Arrays;
import java.util.Stack;

// finding the nearest for element for each element
public class SmallElementOnLeftSide {
    public static int[] findSmallElementOnLeft(int [] arr){
        Stack<Integer> stack=new Stack<>();
        int result[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=stack.peek();
            }
            stack.push(i);
        }
        return result;

    }
    public static void main(String[] args) {
       int arr[]={4,5,2,10,3,12};
       int [] res=findSmallElementOnLeft(arr);
        System.out.println(Arrays.toString(res));
    }
}
