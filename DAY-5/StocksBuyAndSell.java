public class StocksBuyAndSell {
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4};
        int profit = StocksBuyAndSell(arr);
        System.out.println(profit);
        

        
    }
    public static int StocksBuyAndSell(int a[]) {
        int n=a.length;
        int maxProfit=0,minSofar=a[0],profit;

        for(int i=0;i<n;i++){
            minSofar=Math.min(minSofar, a[i]);
            profit=a[i]-minSofar;
            maxProfit=Math.max(maxProfit, profit);
        }return maxProfit;
        
    }
    
}
