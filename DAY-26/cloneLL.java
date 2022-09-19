public class cloneLL {
    public static void main(String[] args) {
        
    }
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node cur = head;
        while(cur != null){
            Node temp = cur.next;
            cur.next = new Node(cur.data);
            cur.next.next = temp;
            cur = temp;
        }
        cur = head;
        
        while(cur != null){
            if(cur.next != null){
                cur.next.random = (cur.random != null)? cur.random.next: null;
            }
            cur = cur.next.next;
        }
        
        Node org = head, copy = head.next, temp = copy;
        while(org != null){
            org.next = org.next.next;
            copy.next = (copy.next != null)? copy.next.next: copy.next;
            org = org.next;
            copy = copy.next;
        }
        return temp;
    }
}

class Node {
    int data;
    Node next;
    Node random;

    public Node(int data) {
        this.data = data;
    }
}