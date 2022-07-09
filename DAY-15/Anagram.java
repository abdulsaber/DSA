public class Anagram {
    public static void main(String[] args) {
        String s1 = "saber";
        String s2 = "rebas";
        System.out.println(isAnagram(s1, s2));
    }
    static boolean isAnagram(String s1, String s2){
        int a[] = new int[256];

        for(int i=0 ;i<s1.length() ; i++){
            a[s1.charAt(i)]++;
        }

        for(int i=0; i<s2.length() ; i++){
            a[s2.charAt(i)]--;
        }

        for (int e : a) {
            if(e != 0) return false;
        }
        return true;
    }

    
}