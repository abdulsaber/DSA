public class union_TwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {4,5,6,7};
        uniion(a, b);
        
    }
    static void uniion(int[] a,int[] b){
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                System.out.print(a[i] + " ");
                j++;
                i++;
                continue;
            }else if(a[i]<b[j]){
                System.out.print(a[i] + " ");
                i++;
            }else if(b[j] < a[i]){
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i] + " ");
            i++; 
        }
        while(j < b.length){
            System.out.print(b[j] + " ");
            j++;
        }

    }
}
    

