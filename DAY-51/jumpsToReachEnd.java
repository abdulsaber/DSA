import java.util.Arrays;

public class jumpsToReachEnd {
    static int minimumJumps(int a[]) {
		int dp[] = new int[a.length+1];
		
		Arrays.fill(dp, -1);
		minimumJumps(a, 0, dp);
		
		// for(int e: dp) {
		// 	System.out.print(e+" ");
		// }
		
		return dp[0];
	}
		
	static int minimumJumps(int a[], int i, int dp[]) {
		if(i >= a.length-1) {
			return 0;
		}
		
		if(dp[i] != -1) return dp[i];
		
		if(a[i] == 0) return Integer.MAX_VALUE;
		
		int min = Integer.MAX_VALUE;
		for(int j = 1; j<=a[i]; j++) {
			min = Math.min(min, minimumJumps(a, i+j, dp) + 1);
		}
		
		return dp[i] = min;
	}
}
