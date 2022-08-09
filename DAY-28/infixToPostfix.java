import java.util.ArrayDeque;

public class infixToPostfix {
    public static void main(String[] args) {
        String s = "(a+b/c)*((g/e)-f)";
        System.out.println(postfix(s));
    } 
    
    static String postfix(String s){
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '('){
                stack.push(cur);
            }else if(cur == ')'){
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }else if(isOperator(cur)){
                while(!stack.isEmpty() &&
                 precedence(cur) <= precedence(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(cur);
            }else{
                sb.append(cur);
            }
            
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    static boolean isOperator(char operator){
        return operator == '+' || operator == '-' || operator == '*' || operator == '/'; 
    }

    static int precedence(char cur){
        if(cur == '+'|| cur == '-') return 1;
        else if(cur == '*' || cur == '/') return 2;
        else return -1;
    }
}
