import java.util.*;
public class union {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,3,4,5,6,7};
        union(a, b);
    }
    static void union(int[] a, int[] b){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set1.add(a[i]);
        }
        for(int i = 0; i < b.length;i++){
                set1.add(b[i]);
        }
        System.out.println(set1);
    }
}
