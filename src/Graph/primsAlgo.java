package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

import static Graph.AdjecencyListGraph.graphCreation;

//prims algo is used to find the minimim spanning tree
// this algo will fail when weight the of the node is negetive values
//class nodes{
//    int val;
//    int weight;
//    nodes(int val,int weight){
//        this.val=val;
//        this.weight=weight;
//    }
//}
public class primsAlgo {
    public static int prims(ArrayList<pair>[] graph) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.add(new pair(0, 0));
        boolean vis[] = new boolean[graph.length];
        int ans = 0;
        while (!pq.isEmpty()) {
            pair rem = pq.remove();

            if (vis[rem.val] == true) continue;
            ;
            int val = rem.val;
            int weight = rem.weight;
            ans += weight;
            vis[val] = true;

            for (pair each : graph[rem.val]) {
                if (vis[each.val] == false) {
                    pq.add(each);
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 2, 10}, {1, 2, 10}, {1, 3, 20}, {2, 4, 30}, {3, 4, 40}};

        int nodes = 5;
        ArrayList<pair>[] graph = graphCreation(nodes, edges);


        System.out.println(prims(graph));
    }
}
