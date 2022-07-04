public class Even_Odd {
    public static void main(String[] args) {
        int n = 456;
        if(evenodd(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }   
    static boolean evenodd(int n){
        if((n&1)==1) return false;
        return true;
    } 
}
