public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,1,2,3};
        int key = 1;
        System.out.println(searchInRotatedArray(a, key)); 
       }
    static int searchInRotatedArray(int[] a, int key){
        int l = 0;
        int r = a.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid] == key) return mid;
            if(a[l] <= a[mid]){ // left part sorted
                if(key >= a[l] && key < a[mid]){ // key is present in left side
                    r = mid - 1;
                }else{ // key is in right side
                    l = mid + 1;
                }
            }else{ // right part sorted
                if(key > a[mid] && key <= a[r]){ // key is present in right side
                    l = mid + 1;
                }else{ // left side;
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
