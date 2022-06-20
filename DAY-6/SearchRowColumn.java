public class SearchRowColumn {
    public static void main(String[] args) {
        int a[][]={
            {1,4,6,7},
            {8,10,12},
            {13,44,78,99}
        };
        int key = 44;
        System.out.println(search(a, key));
        
    }
    public static boolean search(int a[][],int key){
        int row=0,col=a.length-1;       
        while(row<a.length && col>=0){
            if(a[row][col]==key){
                return true;
            } else if(key>a[row][col]){
                row++;
            }else{
                col--;
            }
        }return false;
    }
    
}
