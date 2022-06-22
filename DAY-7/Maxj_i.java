public class Maxj_i {
    public static void main(String[] args) {
        int a[] = {4, 3, 5, 1, 4, 2, 1};
        int n = a.length;

        int Rmax[] = new int[n];
        int Lmin[] = new int[n];

        Rmax[n-1]= a[n-1];
        for(int i=n-2;i>=0;i--){
            Rmax[i]=Math.max(Rmax[i+1], a[i]);
        }
        Lmin[0]= a[0];
        for(int i=1;i<n;i++){
            Lmin[i]=Math.min(Lmin[i-1], a[i]);
        }
        
        int i=0,j=0,ans=0;
        while(i<n && j<n){
            if(Lmin[i]<Rmax[j]){
                ans = Math.max(ans, j-i);
                j++;
            }else {
                i++;
            }
        }
        System.out.println(ans);
    }
    
}
