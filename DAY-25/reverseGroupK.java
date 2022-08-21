public class reverseGroupK {
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
        printLL(reverseByK(head, 2));
    }

    static Node reverseByK(Node head, int k){
        Node cur = head, prevFirst = null, newHead = null;
        while(cur != null){
            Node prev = null, first = cur;
            int count = 0;
            while(cur != null && count < k){
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur  = temp;
                count++;
            }
             if(newHead == null){
                newHead = prev;
             }else{
                prevFirst.next = prev;
             }
             prevFirst = first;
        }
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
