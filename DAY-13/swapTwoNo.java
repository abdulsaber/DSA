public class swapTwoNo {
    public static void main(String[] args) {
        swap(4, 7);
    }
    static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
}
