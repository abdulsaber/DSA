import java.util.ArrayDeque;

public class bipartite {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i = 0; i < color.length; i++){
            color[i] = -1;
        }
        for(int i = 0; i < color.length; i++){
            if(color[i] == -1){
                if(!bfs(graph, i, color)) return false;
            }
        }
        return true;
    }

    public boolean bfs(int[][] graph, int node,int[] color){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(node);
        color[node] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            int[] neighbours = graph[cur];
            for(Integer neighbor : neighbours){
                if(color[neighbor] == -1){
                    color[neighbor] = 1-(color[cur]);
                    q.add(neighbor);
                }else if(color[cur] == color[neighbor]){
                    return false;
                }
            }
        }
        return true;
    }
}
