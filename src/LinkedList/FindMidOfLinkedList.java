package LinkedList;

class Node{
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

public class FindMidOfLinkedList {
    public static Node appendNode(Node head,int value){
        if(head==null) return new Node(value);

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(value);
        return head;
    }

    public static void traverseLinkedList(Node head){
        if(head==null) return;

        while(head!=null){
            System.out.print(head.value+" --> ");
            head=head.next;
        }
        System.out.println();
    }

    public static int findMid(Node head){
        if(head==null) return -1;

        Node slow=head;
        Node fast=head;

        while(slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;

    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head=appendNode(head,20);
        head=appendNode(head,30);
        head=appendNode(head,40);
        head=appendNode(head,50);
        head=appendNode(head,60);

        traverseLinkedList(head);

        int mid=findMid(head);

        System.out.println(mid);


    }
}
