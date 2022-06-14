public class Replace {
    public static void main(String[] args){
        int arr[] = { 7,5,8,9,6,8,5,7,4,6};
        large(arr);
        for (int e : arr) {
            System.out.print(e+" ");
        }
    } 
    
    
    public static void large(int a[]) {
        int n= a.length;
        int max=a[n-1];

         a[n-1] = 0;
         
        for(int i=n-2;i>=0;i--){
            int temp = a[i];
            a[i]=max;

            if(max<temp){
                max = temp;
            }  
        }
    }
    
}
