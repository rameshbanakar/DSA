package Trees;

import java.util.LinkedList;
import java.util.Queue;

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
    public static void levelOrdertraversal(Node root){
        if(root==null) return;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node=queue.poll();
            Node leftNode=node.left;
            Node rightNode=node.right;
            System.out.print(node.value+"-->");
            if(leftNode!=null){
                queue.add(leftNode);
            }
            if(rightNode!=null){
                queue.add(rightNode);
            }

        }
        System.out.println();
    }

    public static void leftSideView(Node root){
        if(root==null) return;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                Node node=queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                if(i==0) System.out.print(node.value+"-->");
            }
            System.out.println();
        }

    }

    public static void rightSideView(Node root){
        if(root==null) return;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                Node node=queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                if(i==size-1) System.out.print(node.value+"-->");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(40);
        root.right=new Node(60);
//        inOrderTraversal(root);
//        preOrderTraversal(root);
        postOrderTraversal(root);
        System.out.println();
        levelOrdertraversal(root);
        leftSideView(root);
        rightSideView(root);
    }
}
