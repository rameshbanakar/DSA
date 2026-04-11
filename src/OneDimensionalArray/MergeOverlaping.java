package OneDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlaping {
    public static void main(String[] args) {
        int intervals[][] = {{1, 2}, {1, 4}, {5, 6}, {6, 8}, {7, 10}, {8, 9}, {12, 14}};
        List<List<Integer>> ans=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                start=Math.min(start,intervals[i][0]);
                end=Math.max(end,intervals[i][1]);
            }else{
                ans.add(List.of(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(List.of(start,end));
        System.out.println(ans);
    }


}
