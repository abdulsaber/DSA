public class Palindrome {
    public static void main(String[] args) {
        int a[]={1,2,3,2,1};
        int begin = 0, end = a.length-1;
        if(pal(a, begin, end)==1){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    static int pal(int a[], int begin, int end){
        if(begin>=end) return 1;
        if(a[begin]==a[end]){
            return pal(a,begin+1,end-1);
        }else{
        return 0;
        }
    }

    
}