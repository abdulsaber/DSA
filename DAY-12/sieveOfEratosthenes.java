import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Eratosthenes(10);
        
    }

    static void Eratosthenes(int n){
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);

        for(int i = 2; i*i <= n; i++){
            if(isprime[i]){
                for(int j=2*i;j<=n;j+=i){
                    isprime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isprime[i]) System.out.println(i);
        }
        
    }
    
}
