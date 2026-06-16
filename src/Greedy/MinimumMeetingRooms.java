package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class sortinhLogic implements Comparator<int[]> {
    @Override  // ✅ compiler will throw error if method name is wrong
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}

public class MinimumMeetingRooms {

    public static int findMinimumMeetingRooms(int arr[][]) {
        Arrays.sort(arr, new sortinhLogic());

        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        int meetingRooms = 1;
        minpq.add(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            if (minpq.peek() > arr[i][0]) {
                minpq.add(arr[i][1]);
                meetingRooms += 1;
            } else {
                minpq.remove();
                minpq.add(arr[i][1]);
            }
        }
        return meetingRooms;

    }

    public static void main(String[] args) {
        int meetings[][] = {{7, 10}, {2, 4}, {15, 20}};
        int ans = findMinimumMeetingRooms(meetings);
        System.out.println(ans);

    }
}
