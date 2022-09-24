import java.util.ArrayDeque;

public class simpleDirectoryPath {
    public static void main(String[] args) {
        //String s = "/a/./b/../../c/";
        String s = "/a//b//c//////d";
        System.out.println(path(s));
    }
    static String path(String s){
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        

        for(int i = 0; i< s.length(); i++){
            String dirc = "";

            while(i < s.length() && s.charAt(i) == '/') i++;
            while(i < s.length() && s.charAt(i) != '/'){
                dirc += s.charAt(i);
                i++;
            }

            if(dirc.equals("..")){
                while(!stack.isEmpty()) stack.pop();
            }else if(dirc.equals(".")){
                continue;
            }else{
                stack.push(dirc);
            }

        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append("/");
        }

        return sb.reverse().toString();
    }
    
    
}