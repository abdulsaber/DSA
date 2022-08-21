public class palindrome_LL {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(20);
        Node n5 = new Node(10);
       

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(isPalindrome(head));
    
    }
    static boolean isPalindrome(Node head){
        Node A = head;
        Node rev = reverse(head);
        while(A != null && rev != null){
            if(A.data == rev.data){
                return true;
            }
            A = A.next;
            rev = rev.next;
        }
        return false;
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
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}