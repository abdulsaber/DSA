import java.util.ArrayDeque;

public class reverseWords {
    public static void main(String[] args) {
        String s = "I AM ABDUL SABER";
        reverse(s);

    }

    static void reverse(String s){
        ArrayDeque<String> stack = new ArrayDeque<>();
        String temp = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                stack.push(temp);;
                temp = "";
            }else{
                temp += s.charAt(i);
            }
        }
        stack.push(temp);
        // System.out.println(stack.peek());
        while(!stack.isEmpty()){
            temp = stack.peek();
            System.out.print(temp+" ");
            stack.pop();
        }
        System.out.println();
    }
    
}
