public class fastPowerMod_n {
    public static void main(String[] args) {
        int a = 3978432, b = 5, n = 1000000007;
        System.out.println(fastPower(a, b, n));
    }

    static long fastPower(long a, long b, long n){
        if(b==0) return 1;

        long halfres = fastPower(a, b/2, n);

        long fullres = (halfres % n * halfres % n) % n ;

        if(b%2 != 0) return (fullres%n * a%n)%n ;

        return fullres;

    }
    
}