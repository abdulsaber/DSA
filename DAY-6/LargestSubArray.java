public class LargestSubArray {
    public static void main(String[] args) {
        int a[]={1,0,1,1,1,0,0};
        //BruteForce
        System.out.println(subarray(a));
    }
    public static int subarray(int a[]){
        int n=a.length;
        int maxlength=0;

        for(int i=0;i<n;i++){
            int zero=0, one=0;
            for(int j=i;j<n;j++){
                if(a[j]==0){
                    zero++;
                }else one++;
                if(zero==one){
                     maxlength = Math.max(maxlength, j-i+1);
                }
            }
        }return maxlength;
    }
    
}
