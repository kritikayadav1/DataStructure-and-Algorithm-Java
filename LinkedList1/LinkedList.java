package LinkedList1;

public class LinkedList {

    // Har Node ke andar data + next
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // First Node
    public static Node head;

    // Last Node
    public static Node tail;

    // Total number of Nodes
    public static int size;


    // ================= ADD FIRST =================
    public void addFirst(int data) {

        // New Node banao
        Node newNode = new Node(data);

        // Ek Node add hua
        size++;

        // Agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // New Node ko old head se connect karo
        newNode.next = head;

        // New Node ko head banao
        head = newNode;
    }


    // ================= ADD LAST =================
    public void addLast(int data) {

        // New Node banao
        Node newNode = new Node(data);

        // Ek Node add hua
        size++;

        // Agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Old tail ko New Node se connect karo
        tail.next = newNode;

        // New Node ko tail banao
        tail = newNode;
    }


    // ================= ADD MIDDLE =================
    public void addMiddle(int idx, int data) {

        // Agar index 0 hai to Add First
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // New Node banao
        Node newNode = new Node(data);

        // Ek Node add hua
        size++;

        // Temp head se start karega
        Node temp = head;
        int i = 0;

        // Temp ko idx - 1 tak lekar jao
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // New Node ko next Node se connect karo
        newNode.next = temp.next;

        // Previous Node ko New Node se connect karo
        temp.next = newNode;
    }


    // ================= REMOVE FIRST =================
    public int removeFirst() {

        // Case 1: List already empty hai
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        // Case 2: Sirf ek Node hai
        if (size == 1) {

            // Remove hone wali value save karo
            int val = head.data;

            // Ek hi Node tha, remove hone ke baad list empty
            head = tail = null;

            // Ab 0 Nodes hain
            size = 0;

            return val;
        }

        // Case 3: Multiple Nodes hain

        // First Node ki value save karo
        int val = head.data;

        // Head ko second Node par shift karo
        head = head.next;

        // Ek Node kam ho gaya
        size--;

        return val;
    }
public int removeLast() {

    // Case 1: Agar Linked List empty hai
    if (size == 0) {
        System.out.println("Linked List is empty");
        return Integer.MIN_VALUE;
    }

    // Case 2: Agar sirf 1 Node hai
    if (size == 1) {

        // Remove hone wali value save karo
        int val = head.data;

        // Ek hi Node tha, isliye head aur tail dono null
        head = tail = null;

        // Ab koi Node nahi bacha
        size = 0;

        // Removed value return karo
        return val;
    }

    // Case 3: Agar multiple Nodes hain

    // prev ko head se start karo
    Node prev = head;

    int i = 0;

    // prev ko second-last Node tak le jao
    while (i < size - 2) {
        prev = prev.next;
        i++;
    }

    // Purane tail ki value save karo
    int val = tail.data;

    // Second-last Node ko new tail banao
    tail = prev;

    // New tail ke aage ka connection hata do
    tail.next = null;

    // Ek Node remove hua
    size--;

    // Removed value return karo
    return val;
}

    // ================= SEARCH =================
    public int iterativeSearch(int key){
Node temp=head;
int i=0;
while(temp!=null){
    if(temp.data==key){
        return i;
    }
    temp=temp.next;
    i++;
}
return -1;
    }

        // ================= RECURSIVE =================

    public int recursiveSearch(int key) {
    return helper(head, key);
}

public int helper(Node head, int key) {

    // List khatam ho gayi
    if (head == null) {
        return -1;
    }

    // Current node par key mil gayi
    if (head.data == key) {
        return 0;
    }
                                      
    // Next node me search karo
    int idx = helper(head.next, key);

    // Aage bhi nahi mili
    if (idx == -1) {
        return -1;
    }

    // Current node ki wajah se 1 add karo
    return idx + 1;
}


    // ================= PRINT =================
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // ================= MAIN =================
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);      // size = 1
        ll.addFirst(20);      // size = 2
        ll.addFirst(30);      // size = 3

        ll.addLast(40);       // size = 4

        ll.addMiddle(2, 11);  // size = 5

        // 30 -> 20 -> 21 -> 10 -> 40
        ll.print();

        System.out.println("Size = " + size);

        // First Node remove hoga = 30
        System.out.println("Removed First= " + ll.removeFirst());

        // 20 -> 21 -> 10 -> 40
        ll.print();

        System.out.println("Size = " + size);
        ll.print();

System.out.println("Removed Last = " + ll.removeLast());

ll.print();

System.out.println("Size = " + size);
System.out.println(ll.iterativeSearch(30));
System.out.println(ll.recursiveSearch(30));

    }
}