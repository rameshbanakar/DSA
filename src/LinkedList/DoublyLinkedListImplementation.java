package LinkedList;

public class DoublyLinkedListImplementation {

    public static Node addNode(Node head, int val) {
        if (head == null) return new Node(val);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static void traverse(Node head) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
    }

    public static void traverseReverse(Node head) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println();
//        temp=temp.prev;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.prev;
        }
    }

    public static Node deleteNode(Node head, int val) {
        if (head == null) return null;

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.value == val) {
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = addNode(null, 10);
        head = addNode(head, 20);
        head = addNode(head, 30);
        head = addNode(head, 40);
        head = addNode(head, 50);

        traverse(head);
        traverseReverse(head);
        deleteNode(head, 40);
        System.out.println();
        traverse(head);

    }
}
