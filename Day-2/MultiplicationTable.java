import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to print it's multiplication table: ");
        n = sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(n+" x "+ i +" = "+ n * i);
        }
    }
    
}
