import javax.swing.text.html.HTMLDocument.RunElement;

public class SubSet_Sum {
    public static void main(String[] args) {
        int set[] = {1,2,3,4,5};
        int sum = 6, n = set.length;
        System.out.println(isSum(set, n, sum));

    }
    static boolean isSum(int set[],int n, int sum){
        if(sum == 0) return true;
        if(n==0) return false;

        if(set[n-1] > sum){
           return isSum(set, n-1, sum);
        }

        return isSum(set, n-1, sum)|| isSum(set, n-1, sum-set[n-1]);

    } 
}
