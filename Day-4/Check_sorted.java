import java.beans.IndexedPropertyChangeEvent;

public class Check_sorted {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int count=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }   
        }
        if(count==(arr.length-1)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }
    
}
