public class firstOccurrence {
    public static void main(String[] args) {
        int a[] = {1,1,1,2,3,4,4,6,8,9};
        int key = 2;
        System.out.println(firstOccurrence(a, key));
    }

    static int firstOccurrence(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        int ans = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(a[mid]==key){
                ans = mid;
                r = mid -1;
            }
            else if(a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
    
    
}
