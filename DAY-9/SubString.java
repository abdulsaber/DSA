public class SubString {
    static void substring(String s){
        string(s,0,"");

    }
    static void string(String s, int i, String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        string(s, i+1, cur);
        string(s, i+1, cur+s.charAt(i));
    }
    public static void main(String[] args) {
        substring("saber");
    }
    
}
