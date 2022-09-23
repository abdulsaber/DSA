import java.util.ArrayDeque;


public class minStack_OofOne {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    int min = 0;
    
    
    public void push(int val) {
        if(stack.isEmpty()) stack.push(val);
        else if(val >= min){
            stack.push(val);
        }else{
            stack.push(2*val - min);
        }
        min = val;
        
    }
    
    public void pop() {
        if(stack.peek() >= min){
            stack.pop();
        }else if(stack.isEmpty()){
            System.out.println("stack is empty!!!");
        }else{
            min = 2*min-stack.peek();
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
