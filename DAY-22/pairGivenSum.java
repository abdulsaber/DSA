import java.util.HashSet;

public class pairGivenSum {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int sum = 8;
        Pair pair = sumPair(a, sum);
        if(pair != null){
            System.out.println(pair.a+" "+pair.b);
        }
    }

    static Pair sumPair(int[] a, int sum){
        HashSet<Integer> pair = new HashSet<>();
        for (int value : a) {
            int cs = sum - value;
            if(pair.contains(cs)){
                return new Pair(value, cs);
            }
            pair.add(value);
        }
        return null;
    }
}

class Pair{
    int a,b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
