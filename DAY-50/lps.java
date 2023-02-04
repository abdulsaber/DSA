import java.util.*;

public class lps {
    public int longestPalindromeSubseq(String s1) {
        String s2 = reverse(s1);
        System.out.println(s2);
        return lcs(s1, s2);
    }
    public int lcs(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < s1.length(); i++){
            Arrays.fill(dp[0], 0);
        }
        return lcsDP(s1, s2, s1.length(), s2.length(), dp);
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

    public String reverse(String s){
        String s2 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s2 += s.charAt(i);
        }
        return s2;
    }
}
