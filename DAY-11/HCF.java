public class HCF {
    public static void main(String[] args) {
        int a = 12, b = 29;
        System.out.println(isHCF(a, b));
        System.out.println(modifiedHCF(a, b));

        
    }
    static int isHCF(int a, int b){
        for(int i = Math.min(a, b);i>0;i--){
            if(a%i == 0 && b%i == 0) return i;   
        }
        return -1;
    }

    static int modifiedHCF(int a, int b){
        if(a<b) return modifiedHCF(b, a);

        if(b==0) return a;

        return modifiedHCF(a%b, b);
    }
}
