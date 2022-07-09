public class reverseWords_Strings {
    public static void main(String[] args) {
        String a = "i am saber the bad";
        String saber = reverseString(a);
        System.out.println(saber);
    }
    static void reverseChar(char[] c,int i,int j){
        while(i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;
        }

    }
    static String reverseString(String a){
        char[] c = a.toCharArray();
        int start = 0;
        int end = 0;
        for(; end < a.length();end++){
            if(c[end] == ' '){
                reverseChar(c, start, end-1);
                start = end + 1;
            }
        }reverseChar(c, start, end-1);
        reverseChar(c, 0, c.length-1);
        return new String(c);
    }
    
}
