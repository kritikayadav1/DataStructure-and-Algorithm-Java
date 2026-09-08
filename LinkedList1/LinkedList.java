package LinkedList1;

public class LinkedList {

    // Node class
    // Har node ke andar data aur next hota hai
    public static class Node {

        int data;      // Node ki value
        Node next;     // Next node ka reference

        public Node(int data) {
            this.data = data;   // Data store karo
            this.next = null;   // Starting me next null rahega
        }
    }

    // Head = first node
    public static Node head;

    // Tail = last node
    public static Node tail;


    // ADD FIRST
    // Naya node starting me add karega
    public void addFirst(int data) {

        // Step 1: Naya node banao
        Node newNode = new Node(data);

        // Step 2: Agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 3:
        // New node ka next = old head
        newNode.next = head;

        // Step 4:
        // New node ko head bana do
        head = newNode;
    }


    // ADD LAST
    // Naya node end me add karega
    public void addLast(int data) {

        // Step 1: Naya node banao
        Node newNode = new Node(data);

        // Step 2: Agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 3:
        // Old tail ke next me new node lagao
        tail.next = newNode;

        // Step 4:
        // New node ko tail bana do
        tail = newNode;
    }


    // ADD AT MIDDLE / GIVEN INDEX
    // Kisi particular index par node add karega
    public void addMiddle(int idx, int data) {

        // Agar index 0 hai
        // to directly addFirst kar do
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // Step 1: Naya node banao
        Node newNode = new Node(data);

        // Step 2:
        // Temp ko head se start karo
        Node temp = head;

        int i = 0;

        // Step 3:
        // Temp ko idx - 1 tak le jao
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Step 4:
        // New node ko next node se connect karo
        newNode.next = temp.next;

        // Step 5:
        // Previous node ko new node se connect karo
        temp.next = newNode;
    }


    // PRINT LINKED LIST
    public void print() {

        // Temp ko head se start karo
        Node temp = head;

        // Jab tak temp null nahi hota
        while (temp != null) {

            // Current node ka data print karo
            System.out.print(temp.data + " -> ");

            // Temp ko next node par le jao
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // Add First
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        // Ab list:
        // 30 -> 20 -> 10 -> null
        // Add Last
        ll.addLast(40);

        // Ab list:
        // 30 -> 20 -> 10 -> 40 -> null
        // Add Middle
        // Index 2 par 21 add karenge
        ll.addMiddle(2, 21);
        // Final list:
        // 30 -> 20 -> 21 -> 10 -> 40 -> null
        // Print list
        ll.print();
    }
}