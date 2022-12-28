import java.util.*;

public class cycleUsingKahns {
    static boolean isCycle(int v, int indeg[]){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int count = 0;
        for(int i = 0; i<v; i++){
            if(indeg[i] == 0){
                q.add(i);
                count++;
            }
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            for(Integer neighbor : a.get(cur)){
                indeg[neighbor]--;
                if(indeg[neighbor] == 0){
                    q.add(neighbor);
                    count++;
                }
            }
        }
        if(count < v){
            return true;
        }
        return false;
    }
}
