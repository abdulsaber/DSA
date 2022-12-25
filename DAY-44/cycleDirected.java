import java.util.*;

public class cycleDirected {
    public static boolean cyclePresent(int v, ArrayList<ArrayList<Integer>> adj ){
        boolean vis[] = new boolean[v];
        boolean recS[] = new boolean[v];

        for(int i = 0; i < v; i++){
           if(!vis[i]){
            if(dfs(v, adj, vis, recS)) return true;
           }
        }
        return false;
    }

    public static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recS){
        vis[v] = true;
        recS[v] = true;

        for(Integer neighbor: adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(neighbor, adj, vis, recS)) return true;
            }else if(recS[neighbor]){
                return true;
            }
        }
        recS[v] = false;
        return false;
    }
    
}