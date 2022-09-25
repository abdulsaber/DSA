import java.util.ArrayDeque;

public class twoStack {
    ArrayDeque<Integer> stack1 = new ArrayDeque<>();
    ArrayDeque<Integer> stack2 = new ArrayDeque<>();
    
    public void push(int x) {
        if(!stack1.isEmpty()){
            while(!stack1.isEmpty()) stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()) stack1.push(stack2.pop());
    }
    
    public int pop() {
        int temp = stack1.peek();
        stack1.pop();
        return temp;
    }
    
    public int peek() {
        return stack1.peek();
        
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
