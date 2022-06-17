public class Largest_Length {
    public static void main(String[] args) {
        int a[]={1,1,1,0,0,1,1,1,1,1,1,0,1};
        int count=0,temp_count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                temp_count++;
            }else if(temp_count>count){
                count = temp_count;
                temp_count=0;
            }
        }System.out.println(count);
    }
    
}
