public class RodeCutting {
    public static void main(String[] args) {
        int n =25;
        int a=15,b=7,c=13;
        System.out.println(Rod(n, a, b, c));
        
    }
    static int Rod(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;

        int max_a = Rod(n-a, a, b, c);
        int max_b = Rod(n-b, a, b, c);
        int max_c = Rod(n-c, a, b, c);
        
        int res = Math.max(max_a, Math.max(max_b, max_c));

        if(res == -1) return -1;
        return res+1;
    }
}
