public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 22;
        int hcf = modifiedHCF(a, b);
        int lcm = (a*b)/hcf;
        System.out.println(lcm);
    }
    static int modifiedHCF(int a, int b){
        if(a<b) return modifiedHCF(b, a);

        if(b==0) return a;

        return modifiedHCF(a%b, b);
    }
    
}
