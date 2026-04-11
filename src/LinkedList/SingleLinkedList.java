package LinkedList;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
    public static ListNode addNodeAtLast(ListNode head,int data){
        if(head==null) return new ListNode(data);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new ListNode(data);
        return head;
    }

    public static void printAllElements(ListNode head){
        if(head==null) System.out.println("No Elements found to print");
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
    }

    public static void deleteElementAtLast(ListNode head){
        if(head==null) return;
        while(head.next.next!=null){
            head=head.next;
        }
        head.next=null;
        return;

    }

    public static ListNode deleteElementAtFirst(ListNode head){
        if(head==null) return head;
        return head.next;

    }

    public static ListNode reverseLinkedList(ListNode head){
        if(head==null) return head;

        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }

    public static void main(String[] args) {
        ListNode head=null;
        head=addNodeAtLast(head,10);
        head=addNodeAtLast(head,20);
        head=addNodeAtLast(head,30);
        head=addNodeAtLast(head,40);
        head=addNodeAtLast(head,50);

        head=reverseLinkedList(head);
        printAllElements(head);


    }
}
