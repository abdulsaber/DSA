public class wineSelling {
    static int selling(int[] a, int n){
        int b = 0, s = 0;
        int ans = 0;

        while(b < n && s < n){
            while(a[b] <= 0){
                b++;
                if(b == n) return ans;
            }
            while(a[s] >= 0){
                s++;
                if(s == n) return ans;
            }
            if(Math.abs(a[b]) >= Math.abs(a[s])){
                ans += Math.abs(b-s) * Math.abs(a[s]);
                a[b] += a[s];
                a[s] = 0;
            }else{
                ans += Math.abs(b-s) * Math.abs(a[b]);
                a[s] += a[b];
                a[b] = 0;
            }
        }
        return ans;
    }
}
