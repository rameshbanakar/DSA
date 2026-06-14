package Greedy;

import java.util.ArrayList;
import java.util.Collections;

class Activity {
    int start;
    int end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ActivityCount {

    public static int maxActivityPerform(int[] start, int end[]) {
        ArrayList<Activity> act = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            act.add(new Activity(start[i], end[i]));
        }

        Collections.sort(act, (a, b) -> a.end - b.end);
        int count = 0;
        int lastend = 0;
        for (int i = 0; i < act.size() - 1; i++) {
            if (lastend <= act.get(i).start) {
                count++;
                lastend = act.get(i).end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] = {5, 7, 9, 8, 12, 14, 18, 19};
        int end[] = {6, 9, 13, 18, 15, 18, 20, 21};

        int ans = maxActivityPerform(start, end);
        System.out.println(ans);
    }
}
