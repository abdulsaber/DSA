public class reverseRecursion {
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
        printLL(head);
        System.out.println();
        printLL(reverse(head));

    }

    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        
        return newHead;
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
