public class powerTwo {
    static boolean power(int n){
        int x = n-1;
        int result = n&x;
        if(result == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(power(32));
    }
    
}
