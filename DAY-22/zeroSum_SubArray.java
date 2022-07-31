import java.util.*;

public class zeroSum_SubArray {
    public static void main(String[] args) {
        int[] a = {1,2,6,-6,5};
        System.out.println(zeroSum_SubArray(a));

    }
    static int zeroSum_SubArray(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int cs = 0,i = 1,curLen = 0;
        map.put(0,0);
        for (int value : a) {
            cs += value;
            if(map.containsKey(cs)){
                curLen = i- map.get(cs);
            } 
            else map.put(value,i++ );
        }
        return curLen;
    }
}
