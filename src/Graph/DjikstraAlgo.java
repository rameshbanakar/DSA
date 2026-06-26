package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import static Graph.AdjecencyListGraph.graphCreation;
import static Graph.bfsTraversal.traversegraph;

//this also is used to find the minimum distance form src to every other nodes
public class DjikstraAlgo {
    public static int[] djikstra(int n, ArrayList<pair>[] graph, int index) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];
        dist[index] = 0;
        pq.add(new pair(index, 0));

        while (!pq.isEmpty()) {
            pair rem = pq.remove();
            int node = rem.val;

            if (visited[node] == true) continue;
            visited[node] = true;
            for (pair eachPair : graph[node]) {
                if (dist[node] == Integer.MAX_VALUE) continue;
                int newDist = dist[node] + eachPair.weight;
                if (newDist < dist[eachPair.val]) {
                    dist[eachPair.val] = newDist;
                    pq.add(new pair(eachPair.val, newDist));
                }
            }

        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2, 7}, {1, 3, 8}, {2, 3, 3}, {2, 4, 6}, {3, 4, 4}, {3, 5, 3}, {4, 5, 2}, {5, 6, 5}, {4, 6, 5}, {6, 7, 3}, {5, 7, 2}};
        int nodes = 8;
        ArrayList<pair>[] graph = graphCreation(nodes, edges);
        traversegraph(nodes, graph);
        int[] dist = djikstra(nodes, graph, 1);
        System.out.println(Arrays.toString(dist));
    }
}
