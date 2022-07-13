public class sortTwoTypes_Elements {
    public static void main(String[] args) {
        int[] a = {1,0,0,1,1,0,0,0,0,0};
        sort(a);
        print(a);

    }
    static void print(int[] a){
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
    static void sort(int[] a){
        int n = a.length;
        int count_zero = 0;
        int count_one = 0;

        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                count_zero++;
            }else{
                count_one++;
            }
        }
        System.out.println(count_zero +" "+ count_one);
        int i = 0;
        for(; i<count_zero; i++){
            a[i] = 0;
        }
        for(; i<n; i++){
            a[i] = 1;
        }
    }
    
}
