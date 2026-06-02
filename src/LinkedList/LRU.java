package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    Node head;
    Node tail;
    Map<Integer, Node> map;

    LRU() {
        this.head = new Node(-1);
        this.tail = new Node(-1);
        this.map = new HashMap<>();
        this.head.next = tail;
        tail.prev = this.head;
    }

    public static void main(String[] args) {
        LRU lru = new LRU();
        lru.add(10, 3);
        lru.add(20, 3);
        lru.add(30, 3);
        lru.add(40, 3);


        lru.traverse(lru.head);
    }

    public Node deleteNode(Node head, Node temp) {
        Node preNode = temp.prev;
        Node nextNode = temp.next;

        preNode.next = nextNode;
        nextNode.prev = preNode;
        return head;
    }

    public void add(int x, int limit) {
        if (map.containsKey(x)) {
            Node temp = map.get(x);

            head = this.deleteNode(head, temp);
            Node newNode = new Node(x);
            this.insert(newNode);
            map.put(x, newNode);

        } else {
            if (map.size() == limit) {
                Node temp = head.next;
                deleteNode(head, temp);
                map.remove(temp.value);
            }
            Node newNode = new Node(x);
            this.insert(newNode);
            map.put(x, newNode);
        }

    }

    public void insert(Node newNode) {
        Node prevNode;
        prevNode = tail.prev;

        prevNode.next = newNode;
        newNode.next = tail;
        tail.prev = newNode;
        newNode.prev = prevNode;

    }

    public void traverse(Node head) {
        if (head == null) return;

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}
