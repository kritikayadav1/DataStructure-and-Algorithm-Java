package LinkedList1;
public class CircularLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public void addFirst(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = tail = newNode;
        tail.next = head;
        return;
    }

    newNode.next = head;
    head = newNode;
    tail.next = head;
}

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }
public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();

    cll.addFirst(20);
    cll.addFirst(10);

    cll.print();
}}