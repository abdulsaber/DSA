import java.util.*;

public class nonOverLapping {

    public static int max(int[][] arr){
        Arrays.sort(arr,(a,b) -> 
                    a[0]==b[0]? a[1]-b[1]: a[0]-b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>();

        int max = 0, ans = 0;

        for(int[] e: arr){
            while(!pq.isEmpty()){
                if(pq.peek()[0] > e[0]) break;

                int[] top = pq.poll();
                max = Math.max(max, top[1]); 
            }
            ans = Math.max(ans,max+e[2]);
            pq.add(new int[] {e[1], e[2]});
        }
        return ans;
    }
    
}