package Trees;

public class KthSnallestElement {
    public static int ans = Integer.MAX_VALUE;

    public static TreeNode constructTree(int arr[], int low, int high) {
        if (low > high) return null;
        if (low == high) return new TreeNode(arr[low]);

        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = constructTree(arr, low, mid - 1);
        root.right = constructTree(arr, mid + 1, high);
        return root;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.value + " --> ");
        inOrderTraversal(root.right);

    }

    public static void findKthSmallElement(TreeNode root, int count, int k) {
        if (root == null) return;
        if (ans == Integer.MAX_VALUE) {
            findKthSmallElement(root.left, count, k);
        }

        count++;
        if (count == k) ans = root.value;
        if (ans == Integer.MAX_VALUE) {
            findKthSmallElement(root.right, count, k);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = constructTree(arr, 0, arr.length - 1);
        inOrderTraversal(root);
        System.out.println();
        findKthSmallElement(root, 0, 2);
        System.out.println(ans);
    }
}
