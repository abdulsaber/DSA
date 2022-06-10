public class Smallest {
    public static void main(String[] args) {
        int arr[] = { 100,5,7,88,4,51223,1};
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }System.out.println(min);
    }
    
}
