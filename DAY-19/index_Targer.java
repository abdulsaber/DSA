public class index_Targer {
    public static void main(String[] args) {
        int a[] = {1,3,5,6};
        int key = 7;
        System.out.println(index(a, key));
    }
    static int index(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        int mid=l+(r-l)/2;
        while(l <= r){
            mid = l + (r-l)/2;
            if(a[mid] == key) return mid;
            else if(a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return r+1;
    }
}
