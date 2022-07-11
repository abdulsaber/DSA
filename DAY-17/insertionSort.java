public class insertionSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1,1};
        insertionSort(a);
        print(a);
    }
    static void print(int[] a){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
    static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            int temp = a[i];
            print(a);
            System.out.println();
            int j = i-1;
            for(; j >= 0; j--){
                if(temp < a[j]){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }a[j+1] = temp;
        }

    }
}
