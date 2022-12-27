import java.util.*;

public class inDegree {
    public static void main(String[] args) {
        int v = 6;
    graphUsingAL graph = new graphUsingAL(v);
		
		graph.addEdge(0, 1);
        
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(0, 2);
		graph.addEdge(3, 5);
		graph.addEdge(5, 3);
		graph.addEdge(4, 5);
		
		graph.indegree();
		
		for(int e: graph.indeg) {
			System.out.println(e);
		}
    }
}

class graphUsingAL {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();;
    int v;
    int[] indeg;
    
    public graphUsingAL(int v){
        this.v = v;
        this.indeg = new int[v];
        for(int i = 0; i<v; i++){
            list.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int src, int dest){
        list.get(src).add(dest);
        list.get(dest).add(src);
    }

    void indegree(){
        for(ArrayList<Integer> adj:list){
            for(Integer neighbor: adj){
                indeg[neighbor]++;
            }
        }
    }
    
}
