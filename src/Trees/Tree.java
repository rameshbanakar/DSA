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

    public static Node insertNode(Node root,int value){
        if(root==null){
            return new Node(value);
        }
        if(root.value>value){
            root.left=insertNode(root.left,value);
        }else{
            root.right=insertNode(root.right,value);
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

    public static boolean search(Node root,int target){
        if(root==null) return false;

        if(root.value==target) return true;

        if(root.value>target){
            return search(root.left,target);
        }else{
            return search(root.right,target);
        }
    }

    public static int SmallerElement(Node root){
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.value;
    }

    public static Node largerElement(Node root){
        Node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;
    }

    public static Node deletedNode(Node root,int delete){
        if(root==null) return null;

        if(search(root,delete)==false) return null;

        if(root.value!=delete){
            if(root.value>delete){
                root.left=deletedNode(root.left,delete);
            }else{
                root.right=deletedNode(root.right,delete);
            }
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null && root.right!=null){
                return root.right;
            } else if (root.left!=null && root.right==null) {
                return root.left;
            }else{
                Node maxvalue=largerElement(root.left);
                int rootValue=root.value;
                root.value=maxvalue.value;
                maxvalue.value=rootValue;
                root.left=deletedNode(root.left,delete);
                return root;
            }
        }
        return root;
    }

    public static Node constructTree(int arr[],int low,int high){
        if(low>high) return null;
        if(low==high) return new Node(arr[low]);

        int mid=low+(high-low)/2;
        Node root=new Node(arr[mid]);
        root.left=constructTree(arr,low,mid-1);
        root.right =constructTree(arr,mid+1,high);
        return root;
    }

    public static int sum(Node root){
        if(root==null) return 0;
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.value;
    }

    public static boolean halfTreeSum(Node root,int total){
        if(root==null) return false;

        int left=sum(root.left);
        int right=sum(root.right);

        if(left==total/2 || right==total/2) return true;
        if(halfTreeSum(root.left,total)||halfTreeSum(root.right,total)) return true;
        return false;
    }

    public static boolean isEqualPartition(Node root){
        if(root==null) return false;
        int total=sum(root);
        if(total%2!=0) return false;

        return halfTreeSum(root,total);
    }

    public static boolean hasPathSum(Node root,int target){
        if(root==null) return false;
        if(root.value==target) return true;
        if(hasPathSum(root.left,target-root.value)) return true;
        if(hasPathSum(root.right,target-root.value)) return true;
        return false;
    }

    public static int height(Node root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        Node root=insertNode(null,50);
        root=insertNode(root,60);
        root=insertNode(root,30);
        root=insertNode(root,20);
        root=insertNode(root,70);
        root=insertNode(root,80);

       inOrderTraversal(root);
//        preOrderTraversal(root);
        postOrderTraversal(root);
        System.out.println();
        levelOrdertraversal(root);
        leftSideView(root);
        rightSideView(root);
        System.out.println(search(root,100));
        System.out.println(SmallerElement(root));
        System.out.println(largerElement(root).value);
        deletedNode(root,70);
        preOrderTraversal(root);


        int arr[]={10,15,20,28,32,35,42,45};
        root=constructTree(arr,0,arr.length-1);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        System.out.println(isEqualPartition(root));

        System.out.println(hasPathSum(root,40));

        System.out.println(height(root));
    }
}