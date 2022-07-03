import java.util.ArrayList;

public class primeFactors {
    public static void main(String[] args) {
        int n=24;
        ArrayList <Integer> arr = new ArrayList<>();
        isPrime(n,arr);
        for (Integer e : arr) {
            System.out.print(e + " ");
        }
    }

    static void isPrime(int n, ArrayList<Integer> arr){
        if(n==1) return;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                arr.add(i);
                n /= i;
            }
        }
        if(n>1){
                arr.add(n);
            }
        
    }
    
}
