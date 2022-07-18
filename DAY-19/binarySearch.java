public class binarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,4,6,8,9};
        int key = 11;
        System.out.println(binary(a, key));
    }

    static int binary(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(a[mid]==key) return mid;
            else if(a[mid] < key) l++;
            else r--;
        }
        return -1;
    }
}
