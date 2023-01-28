import java.util.*;

public class bellmanFordAlgo {
    static int[] negativeWeightDis(int n, int[][] edges){
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        for(int count = 0; count < n; count++){
            for(int i = 0; i < edges.length; i++){
                int src = edges[i][0];
                int dest = edges[i][1];
                int wt = edges[i][2];
                if(dist[src] != Integer.MAX_VALUE && dist[src]+wt < dist[dest]){
                    dist[dest] = dist[src]+wt;
                }
            }
        }
        return dist;
    }
    
}