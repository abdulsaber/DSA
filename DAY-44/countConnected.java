public class countConnected {

    //a = adjecency list
    
    public static boolean dfs(int src, boolean vis[]){
        vis[src] = true;

        for(Integer neighbor: a.get(src)){
            if(!vis[neighbor]){
                dfs(neighbor, vis);
            }
        }
    }
    //v= vertices;
    static boolean vis[] = new boolean[v];

    public static int isConnected(){
        int count = 0;
        for(int i = 0; i < v; i++){
            if(!vis[i]){
                count++;
                dfs(i, vis);
            }
        }

        return count;
    }
}
