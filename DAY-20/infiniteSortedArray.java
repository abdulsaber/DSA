public class infiniteSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,22,33};
        int key = 3;
        System.out.println(searchInInfiniteSortedArray(a, key));
    }
    static int searchInInfiniteSortedArray(int[] a, int key){
        if(a.length == 0) return -1;
        if(a[0] == key) return 0;
        int index = 1;

        while(a[index] <= key){
            index *= 2;
        }

        return binarySearch(a, key, index/2, index);
        
    }
    static int binarySearch(int[] a, int key, int l, int r){
        while(l <= r){
            int mid = l + (r-1)/2;
            if(a[mid] == key) return mid;
            else if(a[mid] < key) l = mid + 1;
            else r  = mid - 1;
        }
        return -1;
    }
    
}