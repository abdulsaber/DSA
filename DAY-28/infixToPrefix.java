import java.util.ArrayDeque;

public class infixToPrefix {
    public static void main(String[] args) {
        String s = "(a-b*c)/((e+f)*g/h)";
        //String s = "(a+b)*c";
        System.out.println(prefix(s));
    }

    static String prefix(String st){
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String s = reverse(st);
        for(int i = 0;i<s.length();i++){

            char cur = s.charAt(i);
            if(cur == ')'){
                stack.push(cur);
            }else if(cur == '('){
                while(stack.peek() != ')'){
                    sb.append(stack.pop());
                }stack.pop();
            }else if(isOperator(cur)){ 
                while(!stack.isEmpty() &&
                precedence(cur) < precedence(stack.peek())){
                    sb.append(stack.pop());                  
                }stack.push(cur); 
                
            }else{
                sb.append(cur);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    static String reverse(String s){
        StringBuffer rev = new StringBuffer(s);

        return rev.reverse().toString();
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
