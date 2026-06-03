package Trees;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static Trees.KthSnallestElement.constructTree;

public class VerticalOrderTraversal {

    public static void topView(TreeNode root) {
        if (root == null) return;
        Map<Integer, Integer> map = new HashMap<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int max = 0;
        int min = 0;
        map.put(0, root.value);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeFirst();
                if (node.left != null) {
                    if (i == 0) {
                        min -= 1;
                        queue.addLast(node.left);
                        map.put(min, node.left.value);
                    }
                }
                if (node.right != null) {
                    if (i == size - 1) {
                        max += 1;
                        queue.addLast(node.right);
                        map.put(max, node.right.value);
                    }
                }
            }

        }
        System.out.println(max);
        System.out.println(min);
        for (int i = min; i < max + 1; i++) {
            System.out.print(map.get(i) + "-->");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = constructTree(arr, 0, arr.length - 1);
        topView(root);
    }
}
