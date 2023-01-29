import java.util.Arrays;

public class platforms {
    static int findPltform(int[] a, int[] d, int n){
        Arrays.sort(a);
        Arrays.sort(d);
        int i = 0, j = 0;
        int count = 0;
        int max = 0;

        while(i < n){
            if(a[i] <= d[j]){
                i++;
                count++;
                max = Math.max(max, count);
            }else{
                j++;
                count--;
            }
        }
        return max;
        
    }
}
