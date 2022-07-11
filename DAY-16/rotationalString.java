public class rotationalString {
    public static void main(String[] args) {
        String s = "saber";
        String check = "ersab";
        System.out.println(stringsRotational(s, check));
    }
    static boolean stringsRotational(String s, String check){
        String ss = s + s;
        if(ss.contains(check)){
            return true;
        }
        return false;
    }
    
}
