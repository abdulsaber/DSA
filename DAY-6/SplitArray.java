public class SplitArray {
    public static void main(String[] args) {
        int a[] = {1,3,4,0,4};
        System.out.println(canThreePartsEqualsum(a));
        
    }
    public static boolean canThreePartsEqualsum(int a[]){
        int sum=0,temp=0,count=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        if(sum%3!=0){
            return false;
        }else{
            int s = sum/3;
            for(int i=0;i<a.length;i++){
                temp += a[i];
                if(temp==s){
                    count++;
                    temp=0;
                }
            }
            if(count==3){
                return true;
            }else return false;
        }
    }

}
