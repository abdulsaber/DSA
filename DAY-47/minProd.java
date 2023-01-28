public class minProd {
    static int minimumProduct(int[] a, int n){
        if(n == 1) return a[0];
        int neg = 0, pos = 0, zero = 0;
        int negmax = Integer.MIN_VALUE;
        int posmin = Integer.MAX_VALUE;
        int product = 1;
        for(int e: a){
            if(e < 0){
                pos++;
                posmin = Math.min(posmin, e);
            }if(e > 0){
                neg++;
                negmax = Math.max(negmax, e);
            }if(e == 0) zero++;

            product *= e;
        }
        if(zero == n || (neg == 0 && pos == 0)){
            return 0;
        }
        if(neg == 0) return 0;
        if(neg%2 == 0 && zero != 0){
            product /= negmax;
        }
        return product;
    }
}
