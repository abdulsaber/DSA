import java.util.Scanner;

/**
 * Search
 */
public class Search {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any arr[5] elements: ");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Key: ");
        key = sc.nextInt();

        for(int i=0;i<5;i++){
            if(arr[i]==key){
                System.out.println("Key: "+key+" found at index: "+ i);
            }
        }

        
    }

    
}