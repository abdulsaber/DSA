public class swapTwoBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(swap(n, 1, 2));
    }
    static int swap(int n,int i, int j){
        int ith = (n>>i) & 1;
        int jth = (n>>j) & 1;

        if(ith == jth) return n;

        int mask = (1<<i) | (1<<j);

        return n^mask;

    }
}
