import java.util.ArrayDeque;

public class reverseStack {

    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    public static void main(String[] args) {
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        reverse();

        System.out.println(stack);

    }

    static void reverse(){
        if(!stack.isEmpty()){
            int top = stack.peek();
            stack.pop();
            reverse();
            insert(top);   
        }
    }
    static void insert(int a){
        if(stack.isEmpty()){
            stack.push(a);
        }else{
            int b = stack.peek();
            stack.pop();
            insert(a);
            stack.push(b);
        }
    }
    
}