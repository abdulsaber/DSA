public class unionFind_Rank {
    int[] parent, rank;

    public unionFind_Rank(int n){
        parent = new int[n];
        rank = new int[n];
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
        if(rank[captainA] < rank[captainB] ){
            parent[captainA] = captainB;
        }else if(rank[captainB] < rank[captainA] ){
            parent[captainB] = captainA;
        }else{
            parent[captainB] = captainA;
            rank[captainA]++;
        }

    }

    boolean isConnected(int a, int b){
        int captainA = find(a);
        int captainB = find(b);
        
        return (captainA == captainB);
    }    
}
