import java.util.*;

public class previousGreaterNumber {
    public static void main(String[] args) {
        int a[] = {5, 1, 2, 3, 9, 6, 1, 4, 3};
		int ans[] = greaternumber(a);
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			System.out.print(ans[i]+" ");
			System.out.println();
		}
    }
    static int[] greaternumber(int[] a){
        int[] ans = new int[a.length];
        int i = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int e: a){
            while(!stack.isEmpty() && stack.peek() <= e){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();    
            }
            stack.push(e);
            i++;
        }
        return ans;
    }
}
