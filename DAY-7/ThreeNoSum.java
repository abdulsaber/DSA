public class ThreeNoSum { 
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int sum=22;
        System.out.println(threenosum(a, sum));
    }
    public static Boolean threenosum(int a[],int sum){
        int n = a.length;
       for(int i=0;i<n;i++){
        boolean found = twonosum(a, sum-a[i],i);
        if(found) return true;
       } return false;

    }
    public static Boolean twonosum(int a[],int sum, int i){
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
