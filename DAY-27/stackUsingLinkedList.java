public class stackUsingLinkedList {
    int size = 0;
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    int pop() throws Exception{
        if(isEmpty()) throw new Exception("Stack is empty");
        int ans = head.data;
        head = head.next;
        size--;
        return ans;
    }

    int peek() throws Exception{
        if(isEmpty()) throw new Exception("Stack is empty");
        return head.data;
    }

    boolean isEmpty(){
        return size  == 0;
    }




}
