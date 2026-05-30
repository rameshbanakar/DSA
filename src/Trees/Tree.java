package Trees;

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value=value;
        this.right= null;
        this.left=null;
    }
}
public class Tree {
    public static Node addNode(Node root,int value){
        if(root==null){
            return new Node(value);
        }

        return root;
    }

    public static void inOrderTraversal(Node root){
        if(root==null){
//            System.out.println();
            return;
        }
        System.out.print(root.value+"-->");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.value+"-->");
        inOrderTraversal(root.right);

    }

    public static void postOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.value+"-->");

    }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(40);
        root.right=new Node(60);
//        inOrderTraversal(root);
//        preOrderTraversal(root);
        postOrderTraversal(root);
    }
}
