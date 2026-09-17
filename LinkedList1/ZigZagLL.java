package LinkedList1;

public class ZigZagLL {

    // Node ka structure
    public static class Node {
        int data;       // Node ke andar value store hogi
        Node next;      // Next node ka address/reference store hoga

        public Node(int data) {
            this.data = data; // Jo value aayi, node me store karo
            this.next = null; // Naya node initially kisi ko point nahi karega
        }
    }

    // Linked List ka first node
    public static Node head;

    // Linked List ka last node
    public static Node tail;


    public static void zigZag() {

        // Agar list empty hai ya sirf 1 node hai,
        // toh Zig-Zag karne ki zarurat nahi
        if (head == null || head.next == null) {
            return;
        }
        // =========================
        // STEP 1: MIDDLE FIND KARO
        // =========================

        // slow ko first node (head) par rakha
        Node slow = head;

        // fast ko second node par rakha
        Node fast = head.next;

        // fast jab tak end tak nahi pahuchta, loop chalao
        while (fast != null && fast.next != null) {

            // slow 1 step aage jayega
            slow = slow.next;

            // fast 2 steps aage jayega
            fast = fast.next.next;
        }

        // Loop ke baad slow LEFT half ke last node par hoga
        // Example:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        //           ↑
        //          slow

        // =========================
        // STEP 2: LIST KO CUT KARO
        // =========================

        // slow.next yani 4 se second half start ho raha hai
        // Isliye 4 ko secondHalf me save kar liya
        Node secondHalf = slow.next;

        // slow yani 3 ke next ko null karke list cut kar di
        slow.next = null;

        // Ab:
        //
        // LEFT:
        // 1 -> 2 -> 3 -> null
        //
        // RIGHT:
        // 4 -> 5 -> 6 -> null
        // ↑
        // secondHalf
        // =================================
        // STEP 3: SECOND HALF REVERSE KARO
        // =================================

        // previous initially null
        // Kyunki reverse ke baad 4 last node banega
        Node previous = null;

        // current ko right half ke first node yani 4 par rakha
        Node current = secondHalf;

        // Jab tak current null nahi hota,
        // right half ko reverse karte raho
        while (current != null) {

            // Current ke next node ko pehle save karo
            // Example current = 4 hai toh nextNode = 5
            Node nextNode = current.next;

            // Current ka connection ulta karo
            // First time: 4.next = null
            // Second time: 5.next = 4
            // Third time: 6.next = 5
            current.next = previous;

            // previous ko current node par aage lao
            previous = current;

            // current ko saved next node par aage lao
            current = nextNode;
        }

        // Reverse ke baad:
        //
        // previous
        //    ↓
        //    6 -> 5 -> 4 -> null
        //
        // current = null


        // =================================
        // STEP 4: ZIG-ZAG MERGING
        // =================================

        // leftHead ko LEFT list ke first node 1 par rakha
        Node leftHead = head;

        // rightHead ko reversed RIGHT list ke first node 6 par rakha
        Node rightHead = previous;

        // Starting:
        //
        // leftHead
        //    ↓
        //    1 -> 2 -> 3
        //
        // rightHead
        //     ↓
        //     6 -> 5 -> 4


        // Jab tak left aur right dono me nodes available hain
        while (leftHead != null && rightHead != null) {

            // =====================================
            // Pehle next nodes SAVE karo
            // =====================================

            // leftHead ke next ko save karo
            // Agar leftHead = 1 hai, nextLeft = 2
            Node nextLeft = leftHead.next;

            // rightHead ke next ko save karo
            // Agar rightHead = 6 hai, nextRight = 5
            Node nextRight = rightHead.next;


            // =====================================
            // Ab Zig-Zag connections banao
            // =====================================

            // LEFT node ko RIGHT node se connect karo
            //
            // leftHead = 1
            // rightHead = 6
            //
            // 1.next = 6
            //
            // Result:
            // 1 -> 6
            leftHead.next = rightHead;


            // RIGHT node ko LEFT ke saved next node se connect karo
            //
            // rightHead = 6
            // nextLeft = 2
            //
            // 6.next = 2
            //
            // Result:
            // 1 -> 6 -> 2
            rightHead.next = nextLeft;


            // =====================================
            // Ab pointers ko aage badhao
            // =====================================

            // leftHead ko saved nextLeft par le jao
            // 1 se 2 par
            leftHead = nextLeft;

            // rightHead ko saved nextRight par le jao
            // 6 se 5 par
            rightHead = nextRight;

            // Next round:
            //
            // leftHead = 2
            // rightHead = 5
            //
            // Fir:
            // 2 -> 5 -> 3
            //
            // Finally:
            // 1 -> 6 -> 2 -> 5 -> 3 -> 4
        }


        // =========================
        // STEP 5: TAIL UPDATE KARO
        // =========================

        // tail ko temporarily head par rakha
        tail = head;

        // Jab tak tail ke aage node hai,
        // tail ko aage move karte raho
        while (tail.next != null) {

            // Tail ek node aage jayega
            tail = tail.next;
        }

        // Finally tail last node yani 4 par hoga
    }


    // Linked List print karne ke liye
    public static void printList() {

        // temp ko head se start karo
        Node temp = head;

        // Har node ko traverse karo
        while (temp != null) {

            // Current node ka data print karo
            System.out.print(temp.data + " -> ");

            // temp ko next node par le jao
            temp = temp.next;
        }

        // Last me null print karo
        System.out.println("null");
    }


    public static void main(String[] args) {

        // List create:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        head.next.next.next = new Node(4);

        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = new Node(6);

        // Tail ko last node 6 par rakha
        tail = head.next.next.next.next.next;


        // Zig-Zag se pehle
        System.out.println("Before Zig-Zag:");
        printList();


        // List ko Zig-Zag me convert karo
        zigZag();


        // Zig-Zag ke baad
        System.out.println("After Zig-Zag:");
        printList();
    }
}