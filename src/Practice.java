import java.util.*;

public class Practice {
   public static ArrayList<Integer> findMaxOfEachWindow(int [] arr,int k){
       if(k>arr.length) return new ArrayList<>();
       Deque<Integer> deque=new LinkedList<>();
       ArrayList<Integer> ans=new ArrayList<>();

       int max=Integer.MIN_VALUE;
       for(int i=0;i<k;i++){
           deque.addFirst(arr[i]);
           max=Math.max(max,arr[i]);
       }
       ans.add(max);
       int end=k;
       int start=0;

       while(end<arr.length){
           deque.addLast(arr[end]);
           end++;
           if(deque.size()>k){
               deque.removeFirst();
               start++;
           }
           max=arr[start];
           for(int i=start;i<end;i++){
               max=Math.max(max,arr[i]);
           }
           ans.add(max);
       }
       return ans;

   }

    public static void main(String[] args) {
       int arr[]={3,15,6,12,4,2,10,9,13,2};
        System.out.println(findMaxOfEachWindow(arr,4));

    }
}
