import java.lang.reflect.Array;
import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,3,4,5,6,7,8,9,0};
        System.out.println(intersection(a,b));
    }
    static int[] intersection(int[] a, int[] b){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set1.add(a[i]);
        }
        for(int i = 0; i < b.length;i++){
                set2.add(b[i]);
        }
        set1.retainAll(set2);
        int[] arr = new int[set1.size()];
        int i = 0;
        for (Integer integer : set1) {
            arr[i++]= integer;
        }
        return arr;
    }
}
