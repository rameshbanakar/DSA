package LinkedList;

import static LinkedList.FindMidOfLinkedList.traverseLinkedList;

public class CycleDetectionInLInkedList {
    public static Node cycleNode;

    public static Node addNode(Node head, int value) {
        if (head == null) return new Node(value);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        if (value == 50 || value == 100) {

            cycleNode = newNode;
        }
        temp.next = newNode;
        return head;
    }

    public static void createCycle(Node head) {
        if (head == null) return;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = cycleNode;
    }

    public static void findCycle(Node head) {
        Node slow = head, fast = head;
        boolean cycleFound = false;

        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }
        if (cycleFound) {
            slow = head;
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = null;

        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = addNode(head, 20);
        head = addNode(head, 30);
        head = addNode(head, 40);
        head = addNode(head, 50);
        head = addNode(head, 60);
        head = addNode(head, 70);
        head = addNode(head, 80);
        createCycle(head);
//        traverseLinkedList(head);

        System.out.println("Cycle found in the linkedList ");
        findCycle(head);
        traverseLinkedList(head);


    }
}
