public class isBinaryHeap {
    public static void main(String[] args) {
        int arr[] = {90, 15, 10, 7, 12, 2} ;
        System.out.println(isHeap(arr, 0));
    }

    public static boolean isHeap(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2) return true;

        int left = 2*i + 1;
        int right = 2*i + 2;

        if(arr[i] >= arr[left] && isHeap(arr,left)){
            if(right < n){
                return arr[i] >= arr[right] && isHeap(arr, right);
            }
            else return true;
        }
        return false;
    }
    
}