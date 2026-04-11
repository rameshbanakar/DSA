package Queues;

import java.util.*;
//not complete solution need to understand this problem again
public class FindMaxOfAllWindows {
    public static List<Integer> findMaxOfWindow(int arr[], int k){
        List<Integer> result=new ArrayList<>();
        Deque<Integer> deque=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            deque.addLast(arr[i]);
            max=Math.max(max,arr[i]);
        }
        result.add(max);
        int s=0;
        int e=k;
        while(e<arr.length){
            int firstElement=deque.removeFirst();
            deque.addLast(arr[e]);

            if(result.get(s)==arr[e]) result.add(arr[s]);
            else{
                int maxIn=Integer.MIN_VALUE;
                for(int i=s;i<e;i++){
                    maxIn=Math.max(maxIn,arr[i]);
                }
                result.add(maxIn);
            }
            s++;
            e++;
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,1,9,3,7,6,5,11,8};
        List<Integer> result=findMaxOfWindow(arr,4);
        System.out.println(result);
    }
}