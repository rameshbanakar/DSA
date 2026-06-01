package LinkedList;

import static LinkedList.FindMidOfLinkedList.appendNode;
import static LinkedList.FindMidOfLinkedList.traverseLinkedList;

public class MergingSortedLinkedList {
    public static Node mergingLinkedList(Node head1, Node head2) {
        if (head2 == null) return head1;
        if (head1 == null) return head2;

        Node head;
        if (head1.value < head2.value) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }

        Node temp = head;
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 == null) temp.next = head2;
        if (head2 == null) temp.next = head1;
        return head;

    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1 = appendNode(head1, 20);
        head1 = appendNode(head1, 40);
        head1 = appendNode(head1, 60);
        head1 = appendNode(head1, 80);
        head1 = appendNode(head1, 100);
        head1 = appendNode(head1, 120);


        traverseLinkedList(head1);

        Node head2 = new Node(30);
        head2 = appendNode(head2, 50);
        head2 = appendNode(head2, 70);
        head2 = appendNode(head2, 90);
        head2 = appendNode(head2, 110);
        head2 = appendNode(head2, 130);
        head2 = appendNode(head2, 150);


        traverseLinkedList(head2);

        Node head = mergingLinkedList(head1, head2);
        traverseLinkedList(head);

    }
}
