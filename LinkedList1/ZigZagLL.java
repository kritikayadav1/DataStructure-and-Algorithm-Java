package LinkedList1;

public class ZigZagLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Linked List ka middle find karo
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Slow first half ka last node hai
        Node secondHalf = slow.next;
        slow.next = null;

        // Step 2: Second half ko reverse karo
        Node previous = null;
        Node current = secondHalf;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        // Previous reversed second half ka head hai
        Node leftHead = head;
        Node rightHead = previous;

        // Step 3: Dono halves ko alternate merge karo
        while (leftHead != null && rightHead != null) {
            Node nextLeft = leftHead.next;
            Node nextRight = rightHead.next;

            leftHead.next = rightHead;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }

        // Tail ko dobara calculate karo
        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
    }

    public static void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        System.out.println("Original Linked List:");
        printList();

        zigZag();

        System.out.println("Zig-Zag Linked List:");
        printList();
    }
}