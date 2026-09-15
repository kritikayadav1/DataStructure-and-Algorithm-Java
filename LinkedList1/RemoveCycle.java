package LinkedList1;
public class RemoveCycle {
public static class  Node {
int data;
Node next; 

public Node(int data){
    this.data=data;
    this.next=null;
}}

    public static Node head;

public static boolean removeCyble(){
Node slow= head;
Node fast=head;
while(fast!= null&& fast.next!= null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
        return true;
    }
}
return false; 
}
public static void main(String [] args){
    head=  new Node(1);
    Node second= new Node(2);
    Node third =new Node (3);
    Node fourth = new Node(4);
    Node fifth= new Node(5);



    head.next= second;
     second.next=third;
     third.next=fourth;
     fourth.next =fifth;
     fifth.next = second;
     System.out.println(removeCyble());
}
}