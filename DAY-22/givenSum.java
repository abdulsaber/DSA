import java.util.*;

public class givenSum {
    public static void main(String[] args) {
        int[] a = {4,6,8,9,3};
        int sum = 20;
        subArray(a, sum);
    }

    static void subArray(int[] a, int sum){
        int curSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < a.length;i++) {
            curSum += a[i];
            if(curSum-sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(hash.containsKey(curSum-sum)){
                start = hash.get(curSum-sum)+1;
                end = i;
                break;
            }
            hash.put(curSum, i);
        }
        if(end == -1){
            System.out.println("Not found");
        }else{
            System.out.println(start+" "+end);
        }
    }
    
}