package LinkedList1;

public class DetectCycle {

    // ================= NODE CLASS =================
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


    // ================= DETECT CYCLE =================
    public static boolean isCycle() {

        // Dono head se start karenge
        Node slow = head;
        Node fast = head;

        // Jab tak fast list ke end tak nahi pahunchta
        while (fast != null && fast.next != null) {

            // Slow 1 step chalega
            slow = slow.next;

            // Fast 2 steps chalega
            fast = fast.next.next;

            // Agar dono same node par mil gaye
            // matlab cycle present hai
            if (slow == fast) {
                return true;
            }
        }

        // Agar fast null tak pahunch gaya
        // matlab cycle nahi hai
        return false;
    }


    // ================= MAIN =================
    public static void main(String[] args) {

        // Nodes banao
        head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Normal connections
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Cycle create karo
        // 5 ka next wapas 2 ko point karega
        fifth.next = second;


        // Cycle check
        System.out.println("Cycle Present = " + isCycle());
    }
}