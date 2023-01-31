public class minSquare {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static int minimumSq(int a, int b){
        if(a < b) swap(a, b);

        int result = 0, rem = 0;
        while(b > 0){
            result += a/b;
            rem = a%b;
            a = b;
            b = rem;
        }
        return result;
    }
}
