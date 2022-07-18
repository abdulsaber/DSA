public class countNO_Occurence {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,1,1,2,2,2,3,4,5,6};
        int key = 2;
        int count = rightcount(a, key) - leftcount(a, key) + 1;
        System.out.println(count);
    }
    static int leftcount(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        int ans = 0;
        while(l <= r){
            int mid = (l + r)/2;
            if(a[mid] == key){
                ans = mid;
                r = mid -1;
            }else if(a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
    static int rightcount(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        int ans = 0;
        while(l <= r){
            int mid = (l + r)/2;
            if(a[mid] == key){
                ans = mid;
                l = mid + 1;
            }else if(a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
}
