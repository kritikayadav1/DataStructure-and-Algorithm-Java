package LinkedList1;

public class LinkedList {

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
            return;
        }

        newNode.next = head;
        head = newNode;
    }



    //add at middle
    public void addMiddle(int idx ,int data){
        Node newNode= new Node(data);

        Node temp =head;
        int i=0;
while(i<idx-1){
    temp=temp.next;
    i++;
}
 newNode.next =temp.next;
 temp.next =newNode;






    }
    // Linked List print karne ke liye
    public void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addMiddle(2,21);


        ll.print();
    }
}