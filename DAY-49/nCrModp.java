public class nCrModp {
    static int nCr(int n, int c, int r, int p){
        if(r > (n-r)) r = n-r;

        int dp[] = new int[r+1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = Math.min(i,r); j > 0; j--){
                dp[j] = (dp[j] + dp[j-1]) % p;
            }
        }
        return dp[r];
    }
    
}