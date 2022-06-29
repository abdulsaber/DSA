public class RatinMaze {
    public static void main(String[] args) {

        int a[][] = {
            {1,0,0},
            {1,0,0},
            {1,1,1}
        };
        boolean vise[][] = new boolean[a.length][a.length];
        boolean ispath = ratmaze(a, vise, 0, 0);
        System.out.println(ispath);
        
    }
    static boolean ratmaze(int a[][], boolean vis[][],int i, int j){
        int n = a.length;
        if(i >= n || j >= n || a[i][j] == 0 || vis[i][j]){
            return false;
        }

        if(i==n-1 && j==n-1) return true;

        vis[i][j]=true;

        if(ratmaze(a, vis, i+1, j)) return true;
        if(ratmaze(a, vis, i, j+1)) return true;

        vis[i][j]=false;

        return false;
            


    }
    
}
