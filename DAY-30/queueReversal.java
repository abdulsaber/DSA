import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(!q.isEmpty()){
            stack.push(q.peek());
            q.remove();
        }

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }

    
}
