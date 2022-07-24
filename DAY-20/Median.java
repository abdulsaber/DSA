public class Median {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7};
        System.out.println(findMedianSortedArrays(a, b));
    }
    static double findMedianSortedArrays(int[] a, int[] b ){
        int n1 = a.length;
        int n2 = b.length;
        
        if(n1 > n2) return findMedianSortedArrays(b,a);
        
        int l = 0;
        int r = n1;
        while(l <= r){
            int mid1 = (l+r)/2;
            int mid2 = (n1+n2+1)/2 - mid1;
            
            int max1 = mid1==0? Integer.MIN_VALUE: a[mid1-1];
            int max2 = mid2==0? Integer.MIN_VALUE: b[mid2-1];
            
            int min1 = mid1 == n1? Integer.MAX_VALUE: a[mid1];
            int min2 = mid2 == n2? Integer.MAX_VALUE: b[mid2];
            
            if(max1 <= min2 && max2 <= min1){
                if((n1+n2)%2 == 0){
                    return ((double)Math.max(max1,max2) + (double)Math.min(min1,min2)) / 2;
                }else{
                    return (double)Math.max(max1,max2);
                }
            }else if(max2 > min1){
                l = mid1 + 1;
            }else{
                r = mid1 - 1;
            }
        }
        return 0.0;
    }
}
