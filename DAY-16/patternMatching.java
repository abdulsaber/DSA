public class patternMatching {
    public static void main(String[] args) {
        String s = "ababbabba";
        String p = "bbab";

        pattern(s, p);
        
    }
    static void pattern(String s, String p){
        int n = s.length();
        int m = p.length();

        for(int i=0;i<=n-m;i++){
            int j=0;
            for(;j<m;j++){
                if(s.charAt(i+j) != p.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("Pattern found at "+ i);
            }
        }
    }
    
}
