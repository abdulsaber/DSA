public class Stack {
    public static void main(String[] args) throws Exception {
        stackUsingArray stack_array = new stackUsingArray(3);

        stack_array.push(10);
        stack_array.push(20);
        stack_array.push(30);
        System.out.println(stack_array.pop());
        System.out.println(stack_array.peek());


        stackUsingLinkedList stack_LL = new stackUsingLinkedList();

        stack_LL.push(10);
        stack_LL.push(20);
        stack_LL.push(30);
        stack_LL.push(40);
        stack_LL.push(50);
        System.out.println(stack_LL.pop());
        System.out.println(stack_LL.peek());


    }
}
