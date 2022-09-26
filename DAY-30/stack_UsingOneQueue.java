import java.util.LinkedList;
import java.util.Queue;

public class stack_UsingOneQueue {
    
    Queue<Integer> q1 = new LinkedList<>();
    //Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x) {
        int n = q1.size();
        q1.add(x);

        for(int i = 0; i < n; i++){
            q1.add(q1.peek());
            q1.remove();
        }
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1;
        int temp = q1.peek();
        q1.remove();
        return temp;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
} 
