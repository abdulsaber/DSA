import java.util.Arrays;
public class lcs {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i  =0; i < text1.length(); i++){
            Arrays.fill(dp[i], 0);
        }
       
        return lcsDP(text1, text2, text1.length(), text2.length(), dp);
    }

    public int lcsDP(String s1, String s2, int m, int n, int[][] dp){
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
         return dp[m][n];

    }
    
}