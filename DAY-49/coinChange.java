import java.util.Arrays;
public class coinChange {
    static int coins(int[] a, int n){
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        coinsDP(a, n, dp);
        return dp[n];
    }    

    static int coinsDP(int[] a, int n, int[] dp){
        if(n < 0) return Integer.MAX_VALUE;

        if(dp[n] != -1) return dp[n];

        int min = Integer.MIN_VALUE;

        for(int e: a){
            min = Math.min(min, coinsDP(a, n-e, dp));
        }
        return dp[n] = min+1;
    }
}
