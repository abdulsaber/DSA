public class sortThreeTypes_Elements {
    public static void main(String[] args) {
        int[] a = {1,0,0,2,1,1,0,1,1,1,2,2};
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
        int count_two = 0;

        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                count_zero++;
            }else if(a[i] == 1){
                count_one++;
            }else if(a[i] == 2){
                count_two++;
            }
        }
        System.out.println(count_zero +" "+ count_one+" " + count_two);
        int i = 0;
        for(; i<count_zero; i++){
            a[i] = 0;
        }
        for(; i<(count_zero+count_one); i++){
            a[i] = 1;
        }
        for(; i<n; i++){
            a[i] = 2;
        }



    }
    
}
