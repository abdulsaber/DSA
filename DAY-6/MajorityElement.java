public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {2,2,1,4,5,2,2,2,1};
        int n = a.length;
        int count = 0, finalcount = 0, i=0;
        int curelement = -1;


        for(i=0;i<n;i++){
            if(count == 0){
                curelement = a[i];
                count = 1;
            }else{
                if(curelement==a[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        for (int e : a) {
            if(e==curelement){
                finalcount++;
            }         
        }
        if(finalcount>n/2){
            System.out.println(curelement);
        }else{
            System.out.println("-1");
        }


    }
    
}