import java.util.*;

public class flatternMultilevelLL {
    public Node flatten(Node head) {
        Node cur = head;
        Queue<Node> q = new ArrayDeque<>();
        while(cur != null){
            if(cur.next == null){
                cur.next = q.poll();
            }
            if(cur.child != null){
                q.add(cur.child);
            }
            cur = cur.next;
        }
        return head;
    }

    public class Node{
        int data;
        Node next, child;

        public Node(int data){
            this.data = data;
        }
    }
    
}