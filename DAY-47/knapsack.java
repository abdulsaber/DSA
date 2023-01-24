import java.util.*;

public class knapsack {
    double fractionalKnapsack(int W, Item a[], int n) {
        Arrays.sort(a, new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return i1.weight * i2.value - i2.weight * i1.value;
            }
        });

        double ans = 0;
        for (int i = 0; i < n; i++) {
            if (W >= a[i].weight) {
                ans += a[i].value;
                W -= a[i].weight;
            } else {
                ans += (double) ((a[i].value * W) / (double) a[i].weight);
                break;
            }
        }
        return ans;
    }
}

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}
