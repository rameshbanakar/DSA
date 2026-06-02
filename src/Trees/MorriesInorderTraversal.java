package Trees;

import static Trees.KthSnallestElement.constructTree;

public class MorriesInorderTraversal {
    public static void morriesTraversal(TreeNode root) {
        if (root == null) return;

        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                System.out.println(curr.value + "-->");
                curr = curr.right;

            } else {
                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr) {
                    temp = temp.right;
                }

                if (temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                }
                if (temp.right == curr) {
                    temp.right = null;
                    System.out.println(curr.value + "-->");
                    curr = curr.right;
                }
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = constructTree(arr, 0, arr.length - 1);

        morriesTraversal(root);
    }
}
