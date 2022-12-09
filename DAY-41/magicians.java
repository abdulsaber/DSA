import java.util.*;

public class magicians {
    public int nchoc(int A, ArrayList<Integer> B) {
        Queue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long ans = 0;
        
        for(Integer e: B){
            pq.add((long)e);
        }
        while(A-- > 0){
            long top = pq.poll();
            ans += top;
            pq.add(top/2);   
        }
        return (int)(ans%(Math.pow(10,9)+7));
    }
}
