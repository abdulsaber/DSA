public class N_Queens {
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];

        nqueen(a, n, 0);
        for (int[] array : a) {
            for (int e : array) {
                System.out.print(e+" ");
            }System.out.println(); 
        }
        
    }

    public static boolean nqueen(int a[][], int n, int row){
        if(row==n) return true;

        for(int col=0;col<n;col++){
            if(isSafe(a,n,row,col)){
                a[row][col] = 1;
                if(nqueen(a,n,row+1)){
                    return true;
                }
                a[row][col]=0;
            }
        }return false;
    }

    static boolean isSafe(int a[][], int n,int row,int col){
        for(int i=0;i<n;i++){
            if(a[i][col]==1) return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(a[i][j]==1) return false;
        }
        for(int i=row,j=col;i>=0&&j<n;i--,j++){
            if(a[i][j]==1) return false;
        }
        return true;
    }
    
    
}
