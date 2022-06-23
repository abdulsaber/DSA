public class GCD {
    public static void main(String[] args) {
        int n1=10,n2=13;
        System.out.println(ans(n1, n2));

    }
    static int ans(int a,int b){
        if(b!=0){
            return ans(b,a%b);
        }return a;
    }
    
}
