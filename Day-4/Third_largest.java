public class Third_largest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,44,99,89};
        int largest=0,second_largest=-1,third=-2;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                third=second_largest;
                second_largest= largest;
                largest = i;   
            }
            else if(second_largest==-1|| arr[i]< arr[largest]){
                if(arr[i] > arr[second_largest]){
                    third =second_largest;
                    second_largest = i;
                }
            }
             if(third==-2||arr[i]<arr[largest]){
                if(arr[i]<arr[second_largest]){
                    third=i;

                }
            }
        }

        System.out.println("Third largest element in an Array: "+ arr[third]);
    }
    
}
