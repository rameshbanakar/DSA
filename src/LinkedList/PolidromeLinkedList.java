package LinkedList;

import static LinkedList.FindMidOfLinkedList.appendNode;
import static LinkedList.FindMidOfLinkedList.traverseLinkedList;

public class PolidromeLinkedList {
    public static boolean polidrome(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node head2 = mid.next;
        mid.next = null;

        Node temp = head2;
        Node prev = null;

        while (temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;

        }

        head2 = prev;
        traverseLinkedList(head);

        while (head != null && head2 != null) {
            if (head.value != head2.value) {
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = appendNode(head, 20);
        head = appendNode(head, 30);
        head = appendNode(head, 40);
        head = appendNode(head, 50);
        head = appendNode(head, 40);
        head = appendNode(head, 30);
        head = appendNode(head, 20);
        head = appendNode(head, 10);

        boolean check = polidrome(head);
        System.out.println(check);

    }
}
