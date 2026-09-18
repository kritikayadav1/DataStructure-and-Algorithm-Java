package LinkedList1;
public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        int value = head.data;
        head = head.next;
        head.previous = null;
        size--;

        return value;
    }

    public int removeLast() {
        if (tail == null) {
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            int value = tail.data;
            head = tail = null;
            size--;
            return value;
        }

        int value = tail.data;
        tail = tail.previous;
        tail.next = null;
        size--;

        return value;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        System.out.println("Removed from first: " + list.removeFirst());
        list.printList();

        System.out.println("Removed from last: " + list.removeLast());
        list.printList();
    }
}