public class Reverse_array {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int a2[] = new int[10];
        int n=arr.length-1, count=0;
        
        for(int i=0;i<arr.length;i++){
            a2[i]=arr[n];
            n--;
            count++;
        }
        for (int i=0;i<count;i++) {
            System.out.print(a2[i]+" ");
            
        }
    }
    
}
