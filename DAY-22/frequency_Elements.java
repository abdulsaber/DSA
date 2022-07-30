import java.util.*;

public class frequency_Elements {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,4,4,4,4};
        frequency(a);
    }
 
    static void frequency(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : a) {
            if(map.containsKey(e)){
                int temp = map.get(e);
                map.put(e, temp+1);
            }else{
                map.put(e, 1);
            }
        }
        System.out.println(map);
    }
    
}