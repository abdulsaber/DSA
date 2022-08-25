public class palindrome {
    public static void main(String[] args) {
        Node list = new Node(3);
        Node list2 = new Node(2);
        Node list3 = new Node(1);
        Node list4 = new Node(2);
        list4.next = new Node(3);
        
        Node head = list;
        list.next = list2;
        list2.next = list3;
        list3.next = list4;


        System.out.println(isPlandrome(list));
    }
    static boolean isPlandrome(Node head){
        Node start = head;
        Node end = middle(head);

        while(end != null){
            if(start.data != end.data) return false;
            start = start.next;
            end = end.next;
        }
        return true;
    }
    static Node middle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return reverse(slow);
    }
    static Node reverse(Node head){
        Node cur = head, prev = null;

        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}