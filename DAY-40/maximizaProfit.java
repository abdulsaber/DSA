import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class maximizaProfit {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int M = 2;
        System.out.println(max(arr, M));
    }
    public static int max(int[] arr, int M){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;

        for(int e: arr){
            pq.offer(e);
        }
        for(int i = 1; i <= M;i++){
            int max = pq.poll();
            ans += max;
            pq.offer(max-1);
        }
        return ans;
    }
}
