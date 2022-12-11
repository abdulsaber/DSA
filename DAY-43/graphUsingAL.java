import java.util.ArrayList;

public class graphUsingAL {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();;
    int v;
    
    public graphUsingAL(int v){
        this.v = v;
        for(int i = 0; i<v; i++){
            list.add(new ArrayList<Integer>());
        }
    }

    void insertEdge(int src, int dest){
        list.get(src).add(dest);
        list.get(dest).add(src);
    }
    
}
