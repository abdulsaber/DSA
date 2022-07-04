/**
 * Toggle_ithBit
 */
public class Toggle_ithBit {
    static int toggle(int n, int i){
        int mask = i << i;

        int result = n ^ mask;

        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(toggle(n, i));
    }
}