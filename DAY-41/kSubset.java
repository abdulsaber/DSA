import java.util.Arrays;
import java.util.PriorityQueue;

public class kSubset {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 3, 7, 2, 4, 5, 6, 3};
		int k = 3;
		
		System.out.println(splitArrayInKSubsets(a, k));
    }

    public static int splitArrayInKSubsets(int[] a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i<k; i++) {
			pq.offer(0);
		}
		Arrays.sort(a);
		for(int i = a.length-1; i>=0; i--) {
			int cur = a[i];
			int top = pq.poll();
			int toAdd = cur + top;
			pq.offer(toAdd);
		}
		int max = -1;
		for(int e: pq) {
			max = Math.max(max, e);
		}
		return max;
    }
    
    
}