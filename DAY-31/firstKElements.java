import java.util.*;

public class firstKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(q);
        reverseK(q, k);
        System.out.println(q);

    }

    static Queue<Integer> reverseK(Queue<Integer> q, int k){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = q.size();
        for(int i=0; i < k; i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) q.add(stack.pop());
        for(int i=0; i < n-k; i++){
            q.add(q.poll());
        }
      return q;  
    }
    
}