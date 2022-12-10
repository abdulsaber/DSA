public class unionFind {

    int[] parent;

    public unionFind(int n){
        parent = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }

    int find(int x){
        if(parent[x] != x) return parent[x];

        return x;
    }

    void union(int a, int b){
        int captainA = find(a);
        int captainB = find(b);
        if(captainA == captainB) return;
        else if(captainA != captainB){
            parent[captainB] = captainA;
        }

    }

    boolean isConnected(int a, int b){
        int captainA = find(a);
        int captainB = find(b);
        
        return (captainA == captainB);
    }

    
}
