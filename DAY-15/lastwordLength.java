public class lastwordLength {
    public static void main(String[] args) {
        String s = "i am saber";
        System.out.println(lenght_lastword(s));
    }

    static int lenght_lastword(String s){
        char[] c = s.toCharArray();
        int index_space = 0;
        int count = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' '){
                index_space = i;
            }
        }
        for(int i = index_space+1; i < c.length; i++){
            count++;
        }
        return count;
    }
}
