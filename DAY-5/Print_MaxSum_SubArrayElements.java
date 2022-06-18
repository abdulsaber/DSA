public class Print_MaxSum_SubArrayElements {
    public static void main(String[] args) {
        int a[]={8, -7, -3, 5, 6, -2, 3, -4, 2};
        
        int cursum=0,maxsum=Integer.MIN_VALUE;
        int start=0,end=0;

        for(int i=1;i<a.length;i++){
             cursum += a[i];
             if(cursum>maxsum){
                maxsum=cursum;
                end=i;
             }if(cursum<0){
                cursum=0;
                start=i+1;
               
             }
             
        }
        for(int i=start;start<=end;start++){
            System.out.print(a[start]+" ");
        }
        System.out.println("and the maximum sum sumArray is: "+ maxsum);
    }
    
}