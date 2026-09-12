package LinkedList1;

public class isPalidrome {

    // Node Class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head
    public static Node head;

    // Tail
    public static Node tail;


    // Add Last
    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    // Check Palindrome
    public boolean checkPalindrome() {

        // Empty ya single node palindrome hoti hai
        if (head == null || head.next == null) {
            return true;
        }


        // STEP 1: Middle find karo
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
        }


        // STEP 2: Second half reverse karo
        Node prev = null;
        Node curr = slow;
        Node next;

        while (curr != null) {

            next = curr.next;       // next save
            curr.next = prev;       // connection reverse
            prev = curr;            // prev aage
            curr = next;            // curr aage
        }


        // STEP 3: Compare karo
        Node left = head;
        Node right = prev;

        while (right != null) {

            // Values different hain
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
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

        k ll = new k();

        // Palindrome Linked List
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        // 1 -> 2 -> 3 -> 2 -> 1

        ll.print();

        System.out.println("Palindrome = " + ll.checkPalindrome());
    }
}