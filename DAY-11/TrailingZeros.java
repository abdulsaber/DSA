public class TrailingZeros {
    public static void main(String[] args) {
        int n = 25, res = 0;

        while(n>0){
            res += n/5;
            n /= 5;
        }
        System.out.println(res);
        
    }
    
}
