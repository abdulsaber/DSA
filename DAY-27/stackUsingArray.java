public class stackUsingArray {
    int a[];
    int capacity;
    int top;

    public stackUsingArray(int capacity){
        this.capacity = capacity;
        a = new int[capacity];
        top = -1;
    }

    boolean push(int element) throws Exception{
        if(top == capacity-1) throw new Exception("Stack is full");
        top++;
        a[top] = element;
        return true;
    }

    int pop() throws Exception{
        if(top == -1) throw new Exception("Stack is empty");
        int ans = a[top];
        top--;
        return ans;
    }

    int peek(){
        return a[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top;
    }

}


