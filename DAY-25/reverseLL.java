public class reverseLL {
    public static void main(String[] args) {
        Node list = new Node(10);
        Node list2 = new Node(20);
        Node list3 = new Node(30);
        Node list4 = new Node(40);
        Node list5 = new Node(50);
        
        Node head = list;
        list.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        
        printLL(list);
        System.out.println();
        printLL(reverse(list));
    }

    static Node reverse(Node head){
        Node  cur = head, prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        } 
        return prev;
    }

    static void printLL(Node head){
        Node list = head;
        while(list != null){
            System.out.print(list.data+" -> ");
            list = list.next;
        }
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}