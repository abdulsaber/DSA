import java.util.Scanner;

public class Frequency_inSortedArray {
    public static void main(String[] args) {
        int a[]=new int[6];
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 elements:");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element to find it's frequency: ");
        int n=sc.nextInt();
        for(int i=0;i<6;i++){
            if(a[i]==n){
                count++;
            }
        }
        System.out.println("The frequency of "+n+" in an Array is: "+ count);
    }
    
}
