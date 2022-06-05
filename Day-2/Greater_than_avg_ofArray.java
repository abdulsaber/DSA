import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Greater_than_avg_ofArray {
    public static void main(String[] args) {
        int n,sum=0,avg;
        int arr[]= new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array (<10):");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        avg = sum/n;
        System.out.println("Numbers greater than the average of the numbers of a given array are: ");

        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                System.out.println(arr[i]);
            }
        }

        





    }
    
}