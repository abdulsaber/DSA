import java.util.Arrays;

public class dijkstraAlgo {

    public int[] dAlgorithm(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s){
        int ans[] = new int[v];
        boolean[] vis= new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        Arrays.fill(ans, 10000000);
        ans[s] = 0;

        while(pq.size() != 0){
            Pair cur = pq.poll();
            int vt = cur.v;
            int wt = cur.wt;

            if(vis[vt]){
                continue;
            }
            vis[vt] = true;

            ArrayList<ArrayList<Integer>> neighbors = adj.get(vt);
            for(ArrayList<Integer> list: neighbors){
                int vertex = list.get(0);
                int weight = list.get(1);
                if(ans[vertex] > ans[vt]+weight){
                    ans[vertex] = ans[vt]+weight;
                    pq.add(new Pair(vertex, ans[vertex]));
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