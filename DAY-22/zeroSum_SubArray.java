import java.util.*;

public class zeroSum_SubArray {
    public static void main(String[] args) {
        int[] a = {-1,2,6,-6,5};
        System.out.println(zeroSum_SubArray(a));

    }
    static int zeroSum_SubArray(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int cs = 0,curLen = 0;
        map.put(0,-1);
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            cs += value;
            if(map.containsKey(cs)){
                int prev = map.get(cs);
                curLen = Math.max(curLen, i-prev);
            } 
            else map.put(value, i);
        }
        return curLen;
    }
}
