public class queue_LL {

    private Node front, rear;

    void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        int value = front.data;
        front = front.next;
        return value;
    }

    int getFront()throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");
        return front.data;
    }
    boolean isEmpty(){
        return front == null;
    }



    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
