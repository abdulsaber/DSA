public class quickSort {
    public static void main(String[] args) {
        int[] a = {2,3,4,1,8,4,2};
        quicksort(a, 0, a.length-1);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
    static void quicksort(int[] a, int l, int h){
        if(l < h){
            int pivot = partition(a, l, h);
            quicksort(a, l, pivot-1);
            quicksort(a, pivot+1, h);
        }
    }
    static int partition(int[] a, int l, int h){
        int i = l;
        int j = h;
        int pivot = a[l];

        while(i < j){
            while(i < j && a[i] <= pivot) i++;
            while(a[j] > pivot) j--;
            if(i < j){
                swap(a, i, j);
            }
        }swap(a, l, j);
        return j;

    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
     
}