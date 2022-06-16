import javax.swing.plaf.multi.MultiTextUI;

public class Maxsum_subArray {
    public static void main(String[] args) {
        int arr[]={-2,7,-6,4,1,-3,8};
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cursum += arr[i];
            if(maxsum < cursum){
                maxsum = cursum;
            }if(cursum < 0){
                cursum = 0;
            }
        }System.out.println(maxsum);
    }
    
}
