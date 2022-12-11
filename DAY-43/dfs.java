import java.util.ArrayList;

public class dfs {
    public static void dfs(ArrayList<ArrayList<Integer>> list,int src, boolean arr[]){
        arr[src] = true;
        System.out.println(src);
        for(Integer neighbor: list.get(src)){
            if(!arr[neighbor]){
                dfs(list,neighbor,arr);
            }
        }
    }
}
