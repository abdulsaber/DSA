public class removeDuplicates {
    public static void main(String[] args) {
        Node list = new Node(10);
        Node list2 = new Node(10);
        Node list3 = new Node(30);
        Node list4 = new Node(30);
        Node list5 = new Node(50);
        
        Node head = list;
        list.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;

        duplicates(head);
        while(list != null){
            int element = list.data;
            System.out.print(element+" -> ");
            list = list.next;
        }

    }
    static void duplicates(Node head){
        Node l = head;
        while(l.next != null){
            if(l.data == l.next.data){
                l.next = l.next.next;
            }else l = l.next;
        }
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
