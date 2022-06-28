public class Josephus {
    public static void main(String[] args) {

        System.out.println(josp(5, 2));
        
    }
    static int josp(int n,int k){
        if(n==0) return 0;
        
        return (josp(n-1, k)+k)%3;

    }
    
}
