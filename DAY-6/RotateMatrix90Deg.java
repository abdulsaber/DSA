public class RotateMatrix90Deg {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        print(a);
        System.out.println(" ");
        transpse(a);
        rotate(a);
        print(a);

    }
    public static void rotate(int a[][]){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = temp;
            }
        }
    } 
    public static void transpse(int a[][]){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               int temp = a[i][j];
               a[i][j] = a[j][i];
               a[j][i] = temp;
            }
        }
    }
    public static void print(int a[][]){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+ " ");
            }System.out.print("\n");
        }
    }
}
