public class queue_Array {
    int[] a;
    int n;
    int rear;

    public queue_Array(int n){
        a = new int[n];
        this.n = n;
        rear = -1;
    }

    void enqueue(int data) throws Exception{
        if(isFull()) throw new Exception("queue is full"); 
        rear++;
        a[rear] = data;
    }

    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("queue is empty"); 
        int value = a[0];

        for(int i = 0; i<rear;i++){
            a[i] = a[i+1];
        }
        rear--;
        return value;
    }

    boolean isEmpty(){
        return rear == -1;
    }
    boolean isFull(){
        return rear == n-1;
    }
}
