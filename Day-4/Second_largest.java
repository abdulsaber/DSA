public class Second_largest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,44};
        int largest=0,second_largest=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                second_largest= largest;
                largest = i;   
            }
            else if(second_largest==-1|| arr[i]< arr[largest]){
                if(arr[i] > arr[second_largest]){
                    second_largest = i;
                }
            }
        }

        System.out.println("Second largest element in an Array: "+ arr[second_largest]);
    }
    
}
