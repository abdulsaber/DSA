import java.util.*;

public class longestConsecutiveSubSeq {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 1, 6, 8, 2, 3};
        System.out.println(longestConsecutiveSubSeq(a));
    }
    static int longestConsecutiveSubSeq(int[] a){
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for (int e : a) {
            set.add(e);
        }
        for(int e: set){
            if(!set.contains(e-1)){
                int len = 1;
                while(set.contains(++e)){
                   len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
    
}