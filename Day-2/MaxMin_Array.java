import java.util.Scanner;

public class MaxMin_Array {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int n,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        n = sc.nextInt();
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
       for(int i=1;i<n;i++){
           if(arr[i] > max){
               max = arr[i];
           }
           if(arr[i] < min ){
               min = arr[i];
           }
       }
       System.out.println("maximum: "+ max+ "\nminimum: "+ min);
    }
    
}
