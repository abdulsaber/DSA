import java.util.*;
public class largestSubArrayZeroSum {
    public static void main(String[] args) {
        int[] a = {2,5,-3,-4,2,3,2};
        System.out.println(largestSubArrayZeroSum(a));
    }
    static int largestSubArrayZeroSum(int[] a){
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
