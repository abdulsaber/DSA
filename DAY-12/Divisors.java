public class Divisors {
    public static void main(String[] args) {
        printDivisors(20);
        //sortedPrintDivisors(20);
    }

    static void printDivisors(int n){
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                System.out.println(i);
                if(n/i != i) System.out.println(n/i);
            }
        }
    }
    static void sortedPrintDivisors(int n){
        int i = 1;
        for( ; i*i <= n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        i--;
        for( ;i>=1;i--){
            if(n%i==0){
                if(n/i != i) System.out.println(n/i);
            }
        }
    }
}
