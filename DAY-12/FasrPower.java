public class FasrPower {
    public static void main(String[] args) {

        System.out.println(pow(2, 5));
        
    }   
    static int pow(int a, int b){
        if(b==0) return 1;
        int halfres = pow(a, b/2);
        int fullres = halfres * halfres;

        if(b%2 != 0) fullres *= a;
        return fullres;
    } 
}
