package BitManupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoUniqueNumbers {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6,7,8));

//      xor on the all elements of the array
        int xor=0;
        for(int each:arr){
            xor^=each;
        }

//      find the rightmost set bit
        int setBit=0;
        for(int i=0;i<32;i++){
            if((xor&(1<<i))!=0){
                setBit=i;
                break;
            }
        }

        int uniqueNumber1=0;
        int uniqueNumber2=0;
        for(int each:arr){
            if((each&(1<<setBit))!=0){
                uniqueNumber1^=each;
            }else{
                uniqueNumber2^=each;
            }
        }
        System.out.println(uniqueNumber1);
        System.out.println(uniqueNumber2);

    }
}
