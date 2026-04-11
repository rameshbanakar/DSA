package BitManupulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5,1,2,3,4));
        int ans=0;
        for(int i=0;i<32;i++){
           int count=0;
           for(int j=0;j<arr.size();j++){
               int ele=arr.get(j);
               if((ele&(1<<i))!=0){
                   count++;
               }
           }
           if(count%3!=0) ans=ans|(1<<i);
        }
        System.out.println("Unique element:"+ans);
    }

}
