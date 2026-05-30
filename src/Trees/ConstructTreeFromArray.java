package Trees;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value=value;
        this.right= null;
        this.left=null;
    }
}
public class ConstructTreeFromArray {
    public static TreeNode constructTree(int arr[],int low,int high){
        if(low>high) return null;
        if(low==high) return new TreeNode(arr[low]);

        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=constructTree(arr,low,mid-1);
        root.right =constructTree(arr,mid+1,high);
        return root;
    }

    public static void inOrderTraversal(TreeNode root){
        if(root==null){
//            System.out.println();
            return;
        }
        System.out.print(root.value+"-->");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        int arr[]={10,15,20,28,32,35,42,45};
        TreeNode root=constructTree(arr,0,arr.length-1);
        inOrderTraversal(root);


    }
}
