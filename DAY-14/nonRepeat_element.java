public class nonRepeat_element {
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        System.out.println(onenonrepeat(a));
    }
    static int onenonrepeat(int a[]){
        int ans = 0;
        for (int i : a) {
            ans ^= i;
        }
        return ans;
    }
    
}
