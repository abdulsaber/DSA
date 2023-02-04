public class noOfWays {
    static void totalWays(int n){
        int[] dp = new int[n+1]; 

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        totalWays(n, dp);
        for(int e: dp){
            System.out.print(e+" ");
        }
    }    

    static int[] totalWays(int n, int[] dp){
        for(int i = 3; i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp;

    }
    public static void main(String[] args) {
        totalWays(5);
    }
}
