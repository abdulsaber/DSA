public class Largest {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,33};
        int lar = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }

        System.out.println("Largest element in an Array is "+lar);

    }
    
}
