public class ithBit_toOne {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(toOne(n, 0));
        
    }   
    static int toOne(int n, int i){
        int mask = 1>>i;
        return (n|mask);
    } 
}
