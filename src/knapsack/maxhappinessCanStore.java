package knapsack;

import java.util.Arrays;
import java.util.Comparator;

class pair {
    int happ;
    int weight;
    double ratio;

    pair(int happ, int weight) {
        this.happ = happ;
        this.weight = weight;
        this.ratio = (double) happ / weight;
    }
}

class sortingLogic implements Comparator<pair> {
    @Override
    public int compare(pair o1, pair o2) {
        return Double.compare(o2.ratio, o1.ratio);
    }
}

public class maxhappinessCanStore {

    public static void main(String[] args) {
        int happ[] = {3, 8, 10, 2, 5};
        int weight[] = {10, 4, 20, 8, 15};


        pair[] arr = new pair[happ.length];
        for (int i = 0; i < happ.length; i++) {
            arr[i] = new pair(happ[i], weight[i]);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new sortingLogic());


        int capacity = 40;
        double totalHappiness = 0;
        for (int i = 0; i < arr.length; i++) {
            if (capacity >= arr[i].weight) {
                totalHappiness += arr[i].happ;
                capacity -= arr[i].weight;

            } else {
                totalHappiness += arr[i].ratio * capacity;
                break;
            }
        }
        System.out.println(totalHappiness);

    }
}
