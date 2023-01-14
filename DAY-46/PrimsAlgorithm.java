import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    public int PrimsAlgorithm(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        int ans = 0;
        boolean[] vis= new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));

        while(pq.size() != 0){
            Pair cur = pq.poll();
            int vt = cur.v;
            int wt = cur.wt;

            if(vis[vt]){
                continue;
            }
            ans += wt;
            vis[vt] = true;
            ArrayList<ArrayList<Integer>> neighbors = adj.get(vt);
            for(ArrayList<Integer> list: neighbors){
                int vertex = list.get(0);
                int weight = list.get(1);
                if(vis[vertex] == false){
                    pq.add(new Pair(vertex, weight));
                }
            }
        }
        return ans;
    }
}

class Pair implements Comparable<Pair>{
    int v;
    int wt;
    public Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

    public int compareTo(Pair that){
        return this.wt - that.wt;
    }
}