package Graph;

import java.util.ArrayList;

public class CycleDetectionInGraph {
    public static boolean dfs(int index, int parent, ArrayList<Integer>[] graph, boolean visited[], boolean path[]) {
        visited[index] = true;
        path[index] = true;
        ArrayList<Integer> list = graph[index];
        for (int each : list) {
            if (parent == each) continue;
            if (path[each] == true) return true;
            if (visited[each] == false) {
                if (dfs(each, index, graph, visited, path)) return true;
            }
        }
        path[index] = false;
        return false;

    }

    public static boolean traversegraph(ArrayList<Integer>[] graph) {

        int n = graph.length;
        boolean visisted[] = new boolean[n];
        boolean path[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visisted[i] == false) {
                if (dfs(i, -1, graph, visisted, path)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int numberOfNodes = 6;
        ArrayList<Integer>[] graph = new ArrayList[numberOfNodes];

        for (int i = 0; i < numberOfNodes; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            graph[row].add(col);
            graph[col].add(row);
        }
        System.out.println(traversegraph(graph));
    }
}
