public class permutationCoeff {
    static int permutation(int n, int k){
        int ans = 1;
        for(int i = 0; i < k; i++){
            ans *= (n-1);
        }
        return ans;
    }
}
