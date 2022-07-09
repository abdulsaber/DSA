public class reverse32Bit {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(reverse(n));
    }
    static long reverse(long n){
        long res = 0;
        int i = 0;
        while(i<31){
            if((n & (1<<i)) != 0 ){
                res += (1l<<(31-i));
            }i++;
        }
        return res;

    }
}
