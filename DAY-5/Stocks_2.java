public class Stocks_2 {
    public static void main(String[] args) {
        int arr[] = { 5,2,6,1,4,7,3,6};
        Stocks(arr);
    }
    public static void Stocks(int a[]){
        int profit = 0;
        int n = a.length;

        for(int i=1;i<n;i++){
            if(a[i] > a[i-1]){
                profit += (a[i]-a[i-1]);
            }
        }
        System.out.println(profit);

    }
    
}
