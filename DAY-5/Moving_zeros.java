public class Moving_zeros {
    public static void main(String[] args) {
        int a[] = {8,0,3,0,0,5};
        int n = a.length;
        int count = 0;

        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }   
        }
        while(count<n){
            a[count++]=0;
        }
        for (int e : a) {
            System.out.print(e+" ");
            
        }
        
            
        }






    }
    

