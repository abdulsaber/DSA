import java.util.ArrayDeque;

public class areaOfHistogram {
    public static void main(String[] args) {
        int a[] = {4, 3, 9, 2, 5, 1, 8 ,3};
        System.out.println(histogram(a));

        
    }   
    
    static int histogram(int[] a){
        int max = 0;
        int[] prevSmaller = previousSmall(a);
        int[] nextSmaller = nextSmall(a);
        for(int i = 0; i < a.length; i++){
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            int area = width * a[i];
            max = Math.max(max, area);
        }
        return max;
    }

    static int[] previousSmall(int[] a){
        int p[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < a.length; i++){
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()] >= e){
                stack.pop();
            }
            if(stack.isEmpty()){
                p[i] = -1;
            }else{
                p[i] = stack.peek();
            }
            stack.push(i);
        }
        return p;
    }

    static int[] nextSmall(int[] a){
        int n[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = a.length-1; i >= 0; i--){
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()] >= e){
                stack.pop();
            }
            if(stack.isEmpty()){
                n[i] = a.length;
            }else{
                n[i] = stack.peek();
            }
            stack.push(i);
        }
        return n;
    }
}
