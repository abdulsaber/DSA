import java.util.ArrayDeque;

import java.util.*;
//a is Adjecency List of graph
public class bfs {
    public static void bfs(int src, boolean[] vis){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(src);
        vis[src] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            System.out.println(cur);

            for(Integer neighbor: a.get(cur)){
                q.add(neighbor);
                vis[neighbor] = true;
            }
        }
    }
}
