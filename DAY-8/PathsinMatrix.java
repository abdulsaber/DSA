public class PathsinMatrix {
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(path(n, m));

    }   
    static int path(int n, int m){
        if(n==1 || m==1) return 1;
        int right = path(n,m-1);
        int down = path(n-1,m);
        return right + down;
    } 
}
