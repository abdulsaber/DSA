public class queue {
    public static void main(String[] args) throws Exception {
        //queue_LL queue = new queue_LL();
        queue_Array queue = new queue_Array(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
