public class path {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        disjointSet g = new disjointSet(n);
        for(int[] edge : edges){
            g.union(edge[0], edge[1]);
        }
        return g.areConnected(source, destination);
    }
}

class disjointSet{
    int[] parent;
    int n;

    public disjointSet(int n){
        this.n = n;
        this.parent = new int[n];

        for(int i = 0; i < n; i++){
            this.parent[i] = i;
        }
    }

    public boolean areConnected(int u, int v){
        return find(u) == find(v);
    }
    
    public void union(int a, int b){
        if(a != b){
            int p1 = find(a);
            int p2 = find(b);
            parent[p1] = p2;
            
        }
    }

    public int find(int x){
        int u = x;
        while( x != this.parent[x]){
            x = this.parent[x];
        }
        parent[u] = x;
        return x;
    }
}
