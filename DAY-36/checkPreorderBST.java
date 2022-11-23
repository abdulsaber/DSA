import java.util.ArrayDeque;

public class checkPreorderBST {
    public static boolean check(int[] pre){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int root = Integer.MIN_VALUE;

        for(int i = 0; i < pre.length; i++){
            if(pre[i] < root) return false;

            while(!stack.isEmpty() && stack.peek() > pre[i]){
                root = stack.peek();
                stack.pop();
            }
            stack.push(pre[i]);
        }
        return true;
    }
}
