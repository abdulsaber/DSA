public class queue_CircularArray {
    int[] a;
    int front, rear, n;

    public queue_CircularArray(int n){
        a = new int[n];
        this.n = n;
        front = rear = -1;
    }

    void enqueue(int data)throws Exception{
        if(isFull()) throw new Exception("queue if full");
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%n;
        a[rear] = data;
    }

    int dequeue(int data)throws Exception{
        if(isEmpty()) throw new Exception("queue if empty");
        if(front == rear){
            int temp = a[front];
            front = rear = -1;
            return temp;
        }
        int temp = a[front];
        front = (front+1)%n;
        a[rear] = data;
        return temp;
    }

    boolean isEmpty(){
        return rear == -1;
    }

    boolean isFull(){
        return (rear+1)%n == front;
    }
}
