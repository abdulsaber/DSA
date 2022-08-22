public class cycle {
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
        list5.next = list3;

        Node cyclicNode = isCyclic(head);
        if(cyclicNode != null){
            System.out.println("List is cyclic");
        }else System.out.println("non-cyclic");
    }

    static Node isCyclic(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
