public class TwoNoSum {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int sum=3;
        System.out.println(twonosum(a, sum));
        
    }
    public static Boolean twonosum(int a[],int sum){
        int l=0;
        int r=a.length-1;

        while(l < r){
            int temp = a[l]+a[r];
            if(temp > sum){
                r--;
            }else if(temp < sum){
                l++;
            }else{
                return true;
            }
        }return false;
    }
}
