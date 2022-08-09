import java.util.ArrayDeque;

public class deleteMidElement {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        delete(stack, stack.size(), 0);
        System.out.println(stack);
    }

    static void delete(ArrayDeque<Integer> stack, int size, int cur){
        if(stack.isEmpty() || cur == size){
            return;
        }
        int a = stack.pop();
        delete(stack, size, cur+1);

        if(cur != size/2){
            stack.push(a);
        }
    }
}