import java.lang.reflect.Array;

public class leftMostChar {
    public static void main(String[] args) {
        String s = "applejuice";
        char[] str = s.toCharArray();
        int index = repeatsLeaftMost(str);
        if(index == -1){
            System.out.println("No repeating character found");
        }else{
            System.out.println(str[index]);
        }
        
    }
    static int repeatsLeaftMost(char[] str){
        int a[] = new int[256];

        for(int i=0 ;i<str.length ; i++){
            a[str[i]]++;
        }

        for (int i = 0; i < str.length; i++) {
            if(a[str[i]] > 1){
               return i;
            }
        }
        return -1;
    }
    
}
