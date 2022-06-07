import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n,t1 = 0 ,t2 = 1 ,nextterm;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();
        
        nextterm = t1 + t2;
        System.out.print(t1+" "+t2+" ");
        
        for(int i=3;i<=n;i++){
            System.out.print(nextterm+" ");
            t1=t2;
            t2=nextterm;
            nextterm = t1 + t2;
        }
    }  
}