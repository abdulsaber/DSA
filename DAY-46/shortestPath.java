import java.util.*;


public class shortestPath {
    ArrayList<ArrayList<Pair>> adj;
    int v;
    int infinite = Integer.MAX_VALUE;

    public shortestPath(int v){
        adj = new ArrayList<ArrayList<Pair>>();
        this.v = v;
        for(int i = 0; i<v; i++){
            adj.add(new ArrayList<Pair>());
        }
    }

    void addEdge(int src, int des, int wt){
        adj.get(src).add(new Pair(des, wt));
    }

    ArrayDeque<Integer> topologicalSort(){
        ArrayDeque<Integer> st = new ArrayDeque<>();
        boolean vis[] = new boolean[v];

        for(int i = 0; i<v; i++){
            if(!vis[i]){
                dfs(i, st, vis);
            }
        }
        return st;

    }

    void dfs(int src, ArrayDeque<Integer> st, boolean[] vis){
        vis[src] = true;

        for(Pair neighbor : adj.get(src)){
            if(!vis[neighbor.v]){
                dfs(neighbor.v, st, vis);
            }
        }
        st.push(src);
    }

    int[] shortPath(int src){
        int[] dis = new int[v];
        Arrays.fill(dis, infinite);

        ArrayDeque<Integer> stack = topologicalSort();
        dis[src] = 0;

        while(!stack.isEmpty()){
            int cur = stack.pop();

            for(Pair neighbor: adj.get(cur)){
                if(dis[neighbor.v] > dis[cur]+ neighbor.wt){
                    dis[neighbor.v] = dis[cur]+ neighbor.wt;
                }
            }
        }
        return dis;
    }
    
}

class Pair{
    int v;
    int wt;
    public Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }
}