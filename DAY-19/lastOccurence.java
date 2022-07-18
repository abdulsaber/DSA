public class lastOccurence {
    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,2,3,4,5,7,7,7,7,89};
        int key = 7;
        System.out.println(lastOccurrence(a, key));
    }

    static int lastOccurrence(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        int ans = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(a[mid]==key){
                ans = mid;
                l = mid+1;
            }
            else if(a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
}
