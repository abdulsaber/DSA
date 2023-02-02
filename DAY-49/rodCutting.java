import java.util.Arrays;

public class rodCutting {
    static int rod(int[] prices, int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        rodDP(prices, n, dp);
        return dp[n];
    }    
    static int rodDP(int[] prices, int n, int[] dp){
        if(n < 0) return -100000;
        if(dp[n] != -1) return dp[n];
        if(n == 0) return 0;
        int max = -1;
        for(int i = 0; i < prices.length; i++){
            max = Math.max(max, rodDP(prices, n-i-1, dp));
        }
        return dp[n] = max;
    }
}
