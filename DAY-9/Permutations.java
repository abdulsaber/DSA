public class Permutations {
    public static void main(String[] args) {
        permutations("saber", 0, 4);
        
    }
    static String swap(String s, int i, int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
    static void permutations(String s,int l,int r){
        if(l==r) System.out.println(s);
        for(int i=l;i<=r;i++){
            s=swap(s, l, r);
            permutations(s, l+1, r);
        }
    }

    
}