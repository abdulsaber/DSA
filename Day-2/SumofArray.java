import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int sum = 0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of elements of array is: " + sum);   
    }
    
}
