import javax.management.Query;

import java.util.*;
import java.util.LinkedList;
public class kahnsAlgo {
    public static ArrayList<Integer> topologicalSort(int[] indeg, int v) {
        //indegree(); calling indegree function
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int cur = q.poll();
            ans.add(cur);

            for(Integer neighbour: a.get(cur)){
                indeg[neighbour]--;
                if(indeg[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
}
