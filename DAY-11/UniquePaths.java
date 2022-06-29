public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 3;

        int res = 1;
        for(int i=1;i<n;i++){
            res = (res * (m+i))/i;
        }
        System.out.println(res);
    }
    
}
