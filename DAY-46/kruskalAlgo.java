import java.util.*;


class Edge implements Comparable<Edge>{
    int wt, src, des;
    public Edge(int src, int des, int wt){
        this.src = src;
        this.des = des;
        this.wt = wt;
    }

    public int compareTo(Edge that){
        return this.wt - that.wt;
    }
}
public class kruskalAlgo {
    static int[] p, rank[];

    static void union(int x, int y){
        int p1 = find(x);
        int p2 = find(y);
        if(p1==p2) return;
        p[p2] = p1;
    }

    static int find(int x){
        if(p[x] == x) return x;
        return find(p[x]);
    }

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[][] added= new boolean[v][v];
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i = 0; i<adj.size(); i++){
            for(int j = 0;j < adj.get(i).size(); j++){
                ArrayList<Integer> cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i, cur.get(0), cur.get(1)));
                }
            }
        }

        p = new int[v];
        for(int i = 0; i < v; i++){
            p[i] = i;
        }

        Collections.sort(edges);
        int count = 1;
        int ans = 0;

        for(int i=0; count<v; i++){
            Edge edge = edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.des);
            if(rx != ry ){
                union(rx,ry);
                count++;
                ans += edge.wt;
            }
        }
        return ans;
    }
}
