public class countSetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(countset(n));
    }
    static int countset(int n){
         int count = 0;

         while(n>0){
            if((n&1)==1) count++;

            n >>= 1;
         }
         return count;
    }
}
