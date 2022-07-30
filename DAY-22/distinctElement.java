import java.util.*;
public class distinctElement {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,33,4,6,7,8};
        System.out.println(count(a));
    }

    static int count(int[] a){
        Set<Integer> map = new HashSet<>();
        for (int e : a) {
            map.add(e);
        }
        return map.size();
    }
    
}