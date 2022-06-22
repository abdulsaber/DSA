public class Power {
    public static void main(String[] args) {
        int a=2,b=2;
        System.out.println(power(a, b));
    }
    static double power(int a, int b){
        if(b==0) return 1;
        if (b==1) return a;
        return (power(a,b-1) * a);


    }
}
