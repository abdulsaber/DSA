public class XOR {
    public static void main(String[] args) {
        xor(1);
    }
    static void xor(int n){
        int xor = 1;
        for(int i=2;i<=n;i++){
            xor ^= i;
        }
        System.out.println(xor);
    }
}
