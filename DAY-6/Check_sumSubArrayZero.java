import java.util.HashSet;
import java.util.Set;

public class Check_sumSubArrayZero {
    public static void main(String[] args) {
        int a[]={2,3,1,-3,3,-4};
        System.out.println(check(a));
        

        
    }
    public static boolean check(int a[]){
        Set<Integer> set = new HashSet<> ();
        int cursum=0;

        for(int i=0;i<a.length;i++){
            cursum += a[i];
            if(set.contains(cursum)){
                return true;
            }else{
                set.add(cursum);
            }
        }return false;
    }
    
}
