public class mergeSortedLL {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(3);
        n1.next.next = new Node(5);
        n1.next.next.next = new Node(7);

        Node n2 = new Node(2);
        n2.next = new Node(4);
        n2.next.next = new Node(6);
        n2.next.next.next = new Node(8);

        Node head1 = n1;
        Node head2 = n2;

        Node sorted = sort(head1, head2);

        printLL(sorted);

        
    }

    static void printLL(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" -> ");
            cur = cur.next;
        }
    }

    static Node sort(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node head = null, tail = null;
        Node a = head1, b = head2;

        if(a.data <= b.data){
            head = a;
            tail = a;
            a = a.next;
        }else{
            head = b;
            tail = b;
            b = b.next;
        }

        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                tail = a;
                a = a.next;
            }else{
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if(a == null) tail.next = b;
        if(b == null) tail.next = a;

        return head;

    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
