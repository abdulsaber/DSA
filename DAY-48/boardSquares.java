import java.util.Arrays;

public class boardSquares {
    static int minimumCostToCut(int[] x, int[] y, int m, int n){
        Arrays.sort(x);
        Arrays.sort(y);

        int i = m-1, j = n-1;
        int h = 1, v = 1;
        int ans = 0;
        while(i >= 0 && j >= 0){
            if(x[i] >= y[j]){
                ans += x[i] * h;
                i--;
                v++;
            }else{
                ans += y[j] * v;
                j--;
                h++;
            }
        }
        while(i >= 0){
            ans += x[i] * h;
            i--; 
        }
        while(j >= 0){
            ans += y[j] * v;
            j--; 
        }
        return ans;
    }

}
