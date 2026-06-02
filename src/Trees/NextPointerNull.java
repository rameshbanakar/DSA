package Trees;

import java.util.Deque;
import java.util.LinkedList;

import static Trees.KthSnallestElement.constructTree;
import static Trees.KthSnallestElement.inOrderTraversal;

public class NextPointerNull {
    public static void nextPointerToNull(TreeNode root) {
        Deque<TreeNode> treeNodeDeque = new LinkedList<>();

        treeNodeDeque.add(root);

        while (!treeNodeDeque.isEmpty()) {
            int size = treeNodeDeque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeDeque.removeFirst();
                System.out.print(node.value + "-->");
                if (node.left != null) treeNodeDeque.add(node.left);
                if (node.right != null) treeNodeDeque.add(node.right);

            }
            System.out.print("" + null);
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = constructTree(arr, 0, arr.length - 1);
        nextPointerToNull(root);
        inOrderTraversal(root);
    }
}
