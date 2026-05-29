package Stack;

import HashMap.LargestSubarrayWithSumK;

class ListNode{
    int value;
    ListNode next;

    ListNode(int val){
        this.value=val;
        this.next=null;
    }
}

public class StackImplementationUsingLinkedList {
    static ListNode head=null;

    public static void push(int value){
       if(head==null){
           head=new ListNode(value);
       }else{
           ListNode temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=new ListNode(value);
       }
    }
    public static void pop(){
        if(head==null){
            throw new RuntimeException("Underflow error");
        }else{
            ListNode temp=head;
            while(temp.next!=null && temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public static int peak(){
        if(head==null){
            throw new RuntimeException("Stack is empty");
        }else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            return temp.value;
        }

    }
    public static boolean isEmpty(){
        if(head==null) return true;
        else return false;

    }

    public static void print(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        print();
        push(20);
        push(30);
        print();
        pop();
        print();
        System.out.println(peak());
        System.out.println(isEmpty());


    }
}
