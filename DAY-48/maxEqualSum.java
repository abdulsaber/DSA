public class maxEqualSum {
    static int maximumEqualSum(int[] st1, int[] st2, int[] st3, int n1, int n2, int n3){
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for(int e : st1) sum1 += e;
        for(int e : st2) sum2 += e;
        for(int e : st3) sum3 += e;

        int top1 = 0, top2 = 0, top3 = 0;

        while(true){
            if(top1 > n1 || top2 > n2 || top3 > n3) return 0;

            if(sum1 == sum2 && sum2 == sum3) return sum1;

            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= st1[top1];
                top1++;
            }else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= st2[top2];
                top2++;
            }else if(sum3 >= sum2 && sum3 >= sum1){
                sum3 -= st3[top3];
                top3++;
            }
        }
    }

    public static void main(String[] args)
    {
          int stack1[] = { 3, 2, 1, 1, 1 };
          int stack2[] = { 4, 3, 2 };
          int stack3[] = { 1, 1, 4, 1 };
          
          int n1 = stack1.length;
          int n2 = stack2.length;
          int n3 = stack3.length;
          
          System.out.println(maximumEqualSum(stack1, stack2, stack3, n1, n2, n3));
    }
    
}