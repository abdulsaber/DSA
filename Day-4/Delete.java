public class Delete {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,9,7};
        int key = 4;
        delete(arr, key);

        for (int e : arr) {
            System.out.print(e + " ");
            
        }
        
      }

      public static int delete(int a[], int key){
          int i=0;
          int n= a.length;
          for(;i<n;i++){
              if(a[i]==key){
                  break;
              }
          }
          if(i == n) return n;
          for(int j=i;j<n-1;j++){
              a[j]=a[j+1];
          }return n-1;



      }
    
}
