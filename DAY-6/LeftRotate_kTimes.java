public class LeftRotate_kTimes {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        Rotate(a, 3);
        Print(a);
        
    }
    public static void Print(int a[]){
        for (int e : a) {
            System.out.print(e+" ");
            
        }
    }
    public static void Rotate(int a[],int k){
        int n = a.length,j=0,z=0;
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = a[i];
        }
        for(int i=k;i<n;i++){
            a[j++]=a[i];
        }
        for(int i=n-k;i<n;i++){
            a[i]=temp[z++];
        }

    }
}
