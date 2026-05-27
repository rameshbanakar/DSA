package LinkedList;

class ListNode{
    int value;
    ListNode next;

    ListNode(int value){
        this.value=value;
        this.next=null;
    }
}

public class SingleLinkedList{

    public static ListNode appendNode(ListNode head,int value){
          if(head==null){
              return new ListNode(value);
          }
          ListNode currentNode=head;
          while(currentNode.next!=null){
              currentNode=currentNode.next;
          }
          currentNode.next=new ListNode(value);
          return head;
    }

    public static boolean search(ListNode head,int target){
        if(head==null) return false;

        while(head!=null){
            if(head.value==target) return true;
            head=head.next;
        }
        return  false;
    }

    public static int size(ListNode head){
        if(head==null) return 0;
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void traverseLinkedList(ListNode head){
        if(head==null) return;

        while(head!=null){
            System.out.print(head.value+" --> ");
            head=head.next;
        }
        System.out.println();
    }

    public static ListNode delete(ListNode head,int index){
        if(head==null) return head;
        int size=size(head);
        if(index<0 || index>=size) {
            System.out.println("Invalid index");
            return head;
        }

//      header deletion
        if(index==0){
            return head.next;
        }

        int indexCount=0;
        ListNode temp=head;
        while(temp!=null){
            if(indexCount+1==index){
                break;
            }
            temp=temp.next;
            indexCount+=1;
        }

        temp.next=temp.next.next;

        return head;
    }

    public static ListNode insertNode(ListNode head,int value,int index){
        if(head==null && index!=0) return head;
        if(head==null && index==0) return new ListNode(value);

        int indexCount=0;
        ListNode temp=head;
        while(temp!=null){
            if(indexCount+1==index){
                break;
            }
            indexCount+=1;
            temp=temp.next;
        }
        ListNode newNode=new ListNode(value);
        ListNode nextNode=temp.next;
        temp.next=newNode;
        newNode.next=nextNode;
        return head;

    }

    public static ListNode reverseLinkedList(ListNode head){
        if(head==null) return head;

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }

    public static void main(String[] args) {

        ListNode head=appendNode(null,10);
        head=appendNode(head,20);
        head=appendNode(head,30);
        head=appendNode(head,40);
        head=appendNode(head,50);
        head=appendNode(head,60);
        traverseLinkedList(head);

        System.out.println(search(head,30));
        System.out.println(size(head));

//        head=delete(head,5);
        traverseLinkedList(head);

        head=insertNode(head,40,4);
        traverseLinkedList(head);

        head= reverseLinkedList(head);
        traverseLinkedList(head);

    }
}