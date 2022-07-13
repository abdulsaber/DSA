public class mergeSort {
    public static void main(String[] args) {
        int[] a = {1,9,8,7,6,5,4,3,2,1};
        mergesort(a, 0, a.length-1);
        print(a);
    }
    static void mergesort(int[] a, int l, int h){
        if(l<h){
            int mid = (l + h) / 2;
            mergesort(a, l, mid);
            mergesort(a, mid+1, h);
            merge(a,l,mid,h);
        }

    }
    static void merge(int[] a, int l, int mid, int h){
        int[] b = new int[a.length];
        int i = l;
        int j = mid+1;
        int k = l;

        while(i <= mid && j <= h){
            if(a[i] <= a[j]){
                b[k] = a[i];
                i++;
                k++;
            }else{
                b[k] = a[j];
                j++;
                k++;
            }
        }
        if(i > mid){
            while(j <= h){
                b[k] = a[j];
                j++;
                k++;
            }
        }else{
            while(i <= mid){
                b[k] = a[i];
                i++;k++;
            }
        }

        for(i = l; i <=h; i++){
            a[i] = b[i];
        }
    }
    static void print(int[] a){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
