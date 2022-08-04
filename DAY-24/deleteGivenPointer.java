public class deleteGivenPointer {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        Node<Integer> n6 = new Node<>(60);
        //Node<Integer> n7 = new Node<>(70);

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        //n6.next = n7;

        delete(n3.next);
        traverse(head);

    }

    static void delete(Node<Integer> node){
        Node<Integer> cur = node;
        cur.data  = cur.next.data;
        cur.next = cur.next.next;
    }

    static void traverse(Node<Integer> head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" -> ");
            cur = cur.next;
        }System.out.print("end");
    }
}

class Node<T>{
    Node<T> next;
    T data;

    public Node(T data){
        this.data = data;
    }
}
