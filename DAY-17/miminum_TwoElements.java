import java.util.Arrays;

public class miminum_TwoElements {
    public static void main(String[] args) {
        int[] a = {6,18,1,9,14};
        System.out.println(minimum(a));
    }
    static int minimum(int[] a ){
        int min = Integer.MAX_VALUE;

        Arrays.sort(a);

        for(int i = 0; i < a.length-1; i++){
            if(a[i+1] - a[i] < min){
                min = a[i+1] - a[i];
            }
        }

       
        return min;

    }
}
