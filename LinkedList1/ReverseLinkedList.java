package LinkedList1;

public class ReverseLinkedList {

    // Node class
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


    // Reverse Linked List
    public void reverseList() {

        Node prev = null;
        Node curr = head;
        Node next;

        // Old head new tail banega
        tail = head;

        while (curr != null) {

            // Next node save karo
            next = curr.next;

            // Arrow reverse karo
            curr.next = prev;

            // prev ko aage lao
            prev = curr;

            // curr ko aage lao
            curr = next;
        }

        // Last node ko new head banao
        head = prev;
    }


    // Print Linked List
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // Main
    public static void main(String[] args) {

        ReverseLinkedList ll = new ReverseLinkedList();

        // Nodes manually bana rahe hain
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        tail = head.next.next.next;

        System.out.println("Before Reverse:");
        ll.print();

        ll.reverseList();

        System.out.println("After Reverse:");
        ll.print();
    }
}