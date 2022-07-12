public class intersection_2Arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5};
        intersection(a,b);
    }
    static void intersection(int[] a,int[] b){
        int i = 0, j = 0;

        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                System.out.print(a[i]+ " ");
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
        }
    }
}
