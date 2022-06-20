import java.text.BreakIterator;

public class LeftRotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        Print(a);
        System.out.println("\n");
        Rotate(a);
        Print(a);

    }


    public static void Rotate(int a[]){
        int n = a.length;
        int temp = a[0];
        for(int i=0;i<n-1;i++){
            a[i] = a[i+1];
        }a[n-1]=temp;
    }
    public static void Print(int a[]){
        for (int e : a) {
            System.out.print(e+" ");
            
        }
    }


    
}
