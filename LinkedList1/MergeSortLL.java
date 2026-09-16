package LinkedList1;

public class MergeSortLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;


    // 1. Middle find karo
    public static Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    // 2. Do sorted Linked Lists ko merge karo
    public static Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }


    // 3. Merge Sort
    public static Node mergeSort(Node head) {

        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Middle find
        Node mid = getMid(head);

        // List ko 2 parts me divide karo
        Node rightHead = mid.next;
        mid.next = null;

        // Left aur Right ko sort karo
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Dono ko merge karo
        return merge(newLeft, newRight);
    }


    // Print
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Before:");
        printList(head);

        head = mergeSort(head);

        System.out.println("After:");
        printList(head);
    }
}