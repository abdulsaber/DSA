import java.util.*;

public class kLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++){
            pq.offer(nums[i]);
        }
        
        for(int i = k; i < nums.length; i++){
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        
        return pq.peek();
    }
    
}