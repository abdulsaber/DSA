import java.util.*;

public class topologicalDFS {
    public void dfs(int src, ArrayDeque<Integer> st, boolean[] vis){
        vis[src] = true;

        for(Integer neighbor: a.get(src)){
            if(!vis[neighbor]){
                dfs(neighbor, st, vis);
            }
        }
        st.push(src);
    } 

    public void sort(){
        int v = 4; // v=no. of vertices
        boolean vis[] = new boolean[v];
        ArrayDeque<Integer> st = new ArrayDeque();
        for(int i = 0; i<v; i++){
            if(!vis[i]){
                dfs(i,st,vis);
            }
        }
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
        }
    }
}
