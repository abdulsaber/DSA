import java.util.ArrayDeque;

public class minStack {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    ArrayDeque<Integer> minStack = new ArrayDeque<>();
    
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()) minStack.push(val);
        else if(val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int temp = stack.pop();
        if(temp == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
    
}

