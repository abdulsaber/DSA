public class mice {
    static int arrangeMice(int[] mice, int[] holes){
        if(mice.length != holes.length) return -1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mice.length; i++){
            if(max < Math.abs(mice[i]-holes[i])){
                max = Math.abs(mice[i]-holes[i]);
            }
        }
        return Math.abs(max);
    }
}
