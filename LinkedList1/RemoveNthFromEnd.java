package LinkedList1;

public class RemoveNthFromEnd {

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


    // Remove Nth Node from End
    public void deleteNthFromEnd(int n) {

        // Step 1: Size find karo
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }


        // Step 2:
        // Agar head ko hi remove karna hai
        if (n == size) {
            head = head.next;
            return;
        }


        // Step 3:
        // Remove hone wale node se ek pehle tak jao
        int i = 1;
        int iToFind = size - n;

        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }


        // Step 4:
        // Node ko skip/remove karo
        prev.next = prev.next.next;
    }


    // Print
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

        RemoveNthFromEnd ll = new RemoveNthFromEnd();

        // Linked List
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before:");
        ll.print();

        // End se 3rd node remove
        ll.deleteNthFromEnd(3);

        System.out.println("After:");
        ll.print();
    }
}