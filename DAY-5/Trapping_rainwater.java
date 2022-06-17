public class Trapping_rainwater {
    public static void main(String[] args) {
        int a[]= {1,0,2,1,0,1,3,2,1,2,1};
        int n=a.length,waterblocks=0;
        int l[] = new int[n];
        int r[] = new int[n];

        l[0]=a[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(a[i], l[i-1]);
        }
        r[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(a[i], r[i+1]);
        }
        for(int i=0;i<n;i++){
            int tempwater=Math.min(l[i], r[i]) -a[i];
            waterblocks += tempwater;
        }
        System.out.println(waterblocks);
    }
    
}
