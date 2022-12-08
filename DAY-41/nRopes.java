import java.util.*;

public class nRopes {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = 3;
        System.out.println(ropes(arr, n));
    }

    public static int ropes(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;

        for (int e : arr) {
            pq.offer(e);
        }
        for (int i = 0; i < n; i++) {
            if (pq.size() >= 2) {
                int min1 = pq.poll();
                int min2 = pq.poll();

                int newRope = min1 + min2;

                ans += newRope;
                pq.add(newRope);
            }
        }
        return ans;
    }
}
