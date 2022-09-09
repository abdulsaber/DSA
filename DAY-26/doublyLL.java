import java.util.Scanner;

public class doublyLL {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node head = n1;
        n1.prev = null;
        n1.next= new Node(2);
        n1.next.prev = n1;
        n1.next.next = new Node(3);
        n1.next.next.prev = n1.next;
        n1.next.next.next = new Node(4);
        n1.next.next.next.prev = n1.next.next;
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.prev = n1.next.next.next;

            while(n1.next != null){
                //System.out.print(n1.data+"<-");
                n1=n1.next;
            }

            System.out.println("reverse");

            while(n1 != null){
                System.out.print(n1.data+"<-");
                n1=n1.prev;
            }
        
    }
}
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }
}
