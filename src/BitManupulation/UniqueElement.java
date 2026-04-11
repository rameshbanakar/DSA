package BitManupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElement {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,3,2,5,1,4,6);
//      finding the unique element using the bits
        int ans=arr.get(0);
        for(int i=1;i<arr.size();i++){
            ans^=arr.get(i);
        }
        System.out.println("Unique element: "+ans);

    }
}
