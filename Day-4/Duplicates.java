public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,33};
        int index = 0,count=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[index]!=arr[i]){
                arr[index+1] = arr[i];
                index++;
                count++;

                 
            }
        }
        for(int i=0;i<=count;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}