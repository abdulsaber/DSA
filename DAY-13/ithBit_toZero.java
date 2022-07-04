public class ithBit_toZero {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(toOne(n, 4));
        
    }   
    static int toOne(int n, int i){
        if(i<=0) return n;

        return (n & ~(1<<(i-1)));
    } 
    
}