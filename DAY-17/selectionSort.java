public class selectionSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1,1};
        selectionSort(a);
    }

    static void print(int[] a){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    static void selectionSort(int[] a){
        int n = a.length;
        
        for(int i = 0; i < n-1; i++){
            int min = i;
            print(a);
            System.out.println();
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
    }
}
