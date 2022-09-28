import java.util.*;
import java.util.LinkedList;

public class slidingWindowMaximum {
    public int[] maxSlidingWindow(int[] arr, int K) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int N = arr.length, index = 0;
        int[] ans = new int[N-K+1];
        int i;
        for (i = 0; i < K; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) Qi.removeLast();
 
            
            Qi.addLast(i);
        }
 

        for (; i < N; ++i) {
            ans[index++] = arr[Qi.peek()];
 
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K) Qi.removeFirst();

            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) Qi.removeLast();
 
            Qi.addLast(i);
        }
 
        ans[index] = arr[Qi.peek()];
        return ans;
    }
    
}