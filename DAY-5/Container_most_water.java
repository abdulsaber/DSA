public class Container_most_water {
    public static void main(String[] args) {
        int arr[]= {1,4,6,2,4,5,8,3,7};
        int n=arr.length;
        int l=0,r=n-1;
        int maxarea=0;

        while(l<r){
            int height=Math.min(arr[l], arr[r]);
            int distance = r-l;
            int area = height*distance;
            maxarea=Math.max(area, maxarea);
            if(l<r){
                l++;
            }if(r<l){
                r--;
            }
        }
        System.out.println(maxarea);

        
        
    }
    
}
