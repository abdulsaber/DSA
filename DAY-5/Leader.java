public class Leader {
    public static void main(String[] args) {
        int arr[] = {2,7,6,1,4,3};
        int n = arr.length;
        int j=0;
        int a2[] = new int[n];
        int largest=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>largest){
                largest=arr[i];
                System.out.print(arr[i]+ " ");
                a2[j++]=arr[i];
            }
        }

        for(j=j-1;j>=0;j--){
            System.out.print(a2[j]+" ");
        }





        
        //O(N^2)

        // for(int i=0;i<n;i++){
        //     int cur=arr[i];boolean isleader=true;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>cur){
        //             isleader=false;
        //             break;
        //         }
        //     }
        //     if(isleader==true){
        //         System.out.print(arr[i]+" ");
        //     }
        // }







    }
    
}
