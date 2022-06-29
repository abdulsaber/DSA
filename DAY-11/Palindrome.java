public class Palindrome {
    public static void main(String[] args) {
        int n = 123454321;
        System.out.println(isPlandrome(n));
    }

    static boolean isPlandrome(int n){
        int temp = n, x, sum = 0;
        while(n>0){
            x = n%10;
            sum = sum*10 + x;
            n = n/10;
        }
        
        if(temp != sum) return false;

        return true;
    }
    
}
