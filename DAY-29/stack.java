public class stack {
    public static void main(String[] args) {
        minStack_OofOne stack = new minStack_OofOne();
        stack.push(10);
        stack.push(9);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        
    }
}
