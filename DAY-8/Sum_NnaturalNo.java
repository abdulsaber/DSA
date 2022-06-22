public class Sum_NnaturalNo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0) return 0;
        return sum(n-1) + n;
        
    }
}