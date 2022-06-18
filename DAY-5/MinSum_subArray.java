public class MinSum_subArray {
    public static void main(String[] args) {
        int a[]={2, 6, 8, 1, 4};
        int cursum=0,minsum=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            cursum += a[i];
            if(minsum > cursum){
                minsum = cursum;
            }if(cursum > 0){
                cursum = 0;
            }
        }System.out.println(minsum);
    }
}
