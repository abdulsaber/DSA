public class SumOfDigits {
    public static void main(String[] args) {
        int n = 62211;
        System.out.println(sumofdigits(n));
        
    }
    static int sumofdigits(int n){
        if(n==0) return 0;
        int lastdigit = n%10;
        return lastdigit + sumofdigits(n/10);
    }

    
}