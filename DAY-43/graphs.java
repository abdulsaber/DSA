public class graphs {
    int[][] a;
    int v;

    public graphs(int v){
        this.v = v;
        a = new int[v][v];
    }

    void addEdge(int src, int dest){
        a[src][dest] = 1;
    }

    public static void main(String[] args) {
        graphs g = new graphs(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
    }

    
    
}