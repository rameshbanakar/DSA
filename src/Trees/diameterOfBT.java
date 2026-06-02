package Trees;

import static Trees.KthSnallestElement.constructTree;

public class diameterOfBT {
    public static int dia = 0;

    public static int diameter(TreeNode root) {
        dia = 0;
        height(root);
        return dia;
    }

    public static int height(TreeNode root) {
        if (root == null) return -1;

        int left = height(root.left);
        int right = height(root.right);
        dia = Math.max(dia, left + right + 2);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = constructTree(arr, 0, arr.length - 1);
        System.out.println(height(root));
        System.out.println(dia);
    }
}
