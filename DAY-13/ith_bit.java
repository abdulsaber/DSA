public class ith_bit {
public static void main(String[] args) {
    int n = 20;
    System.out.println(findithbit(n, 4));
}
static int findithbit(int n, int i){

    int mask = 1 << i;

    int result = n & mask;

    if(result == 0) return 0;
    else return 1;

}
    
}