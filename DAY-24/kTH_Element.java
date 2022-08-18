public class kTH_Element {
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

        System.out.println(element(head, 4));

    }

    static int element(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
