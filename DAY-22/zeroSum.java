import java.util.HashSet;

public class zeroSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,-6,8};
        System.out.println(zerosum(a));
    }
    static boolean zerosum(int[] a){
        HashSet<Integer> set = new HashSet<>();
        int cs = 0;
        set.add(0);
        for (int value : a) {
            cs += value;
            if(set.contains(cs)) return true;
            else set.add(value);
        }
        return false;
    }
}
