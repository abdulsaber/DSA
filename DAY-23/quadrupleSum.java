import java.util.*;

public class quadrupleSum {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 6, 8, 2, 3 };
        int sum = 15;
        quadrupleSum(a, sum);
    }

    static void quadrupleSum(int[] a, int sum) {
        HashMap<Integer, Pair> map = new HashMap<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                map.put(a[i] + a[j], new Pair(i, j));
            }
        }
        for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
            int firstsum = entry.getKey();
            Pair firstPair = entry.getValue();
            int secondsum = sum - firstsum;
            if (map.containsKey(secondsum)) {
                Pair secondPair = map.get(secondsum);
                if (firstPair.i != secondPair.i && firstPair.i != secondPair.j &&
                        firstPair.j != secondPair.i && firstPair.j != secondPair.j) {
                    System.out.println(firstPair.i + " " + firstPair.j + " " + secondPair.i + " " + secondPair.j);
                }
            }
            // System.out.println("-1");
        }

    }
}

class Pair {
    int i, j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
