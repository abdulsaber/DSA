import java.util.Scanner;

public class Zero_One {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int count=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        n = sc.nextInt();
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i] = 0;
        }
        for(int i=count;i<n;i++){
            arr[i] = 1;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
