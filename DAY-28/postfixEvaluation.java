import java.util.ArrayDeque;

public class postfixEvaluation {
    public static void main(String[] args) {
        String s = "24+";
        System.out.println(evaluation(s));
    }
    static int evaluation(String s){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(isOperator(cur)){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(opteration(a, b, cur));
            }else{
                stack.push(s.charAt(i)-'0');
            }

            
        }return stack.pop();
    }
    static boolean isOperator(char operator){
        return operator == '+' || operator == '-' || operator == '*' || operator == '/'; 
    }

    static int opteration(int a, int b, char c){
        switch(c){
            case '+':
            return a+b;
            case '-':
            return a-b;
            case '/':
            return a/b;
            case '%':
            return a%b;
            case '*':
            return a*b;
        }

        return 0;
    }
}
