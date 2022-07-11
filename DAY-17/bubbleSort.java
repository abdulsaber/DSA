public class bubbleSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1,1};
        bubbleSort(a);
        print(a);
    }
    static void print(int[] a){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
    static void bubbleSort(int[] a){
        int n = a.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
