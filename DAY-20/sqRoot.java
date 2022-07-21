public class sqRoot {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sqRoot(n));
    }
    static int sqRoot(int n){
        int l = 0;
        int r = n;
        int ans = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            int midsq = mid * mid;

            if(midsq == n) return mid;
            if(n < midsq) r = mid -1;
            else{
                ans = mid;
                l = mid +1;
            }
        }
        return ans;
    }
}
