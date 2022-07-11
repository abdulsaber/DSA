public class longestSubString_DistinctChar {
    public static void main(String[] args) {
        String s = "saberis";
        System.out.println(substring_length(s));
    }
    static int substring_length(String s){
        int n = s.length();
        boolean[] visited = new boolean[256];
        int res  = 0;

        for(int i=0; i < n; i++){
            for(int j = i; j < n; j++){
                if(visited[s.charAt(j)] == true){
                    break;
                }else{
                    res = Math.max(res, j-i+1);
                    visited[s.charAt(j)] = true;
                }
            }

            visited[s.charAt(i)] = false;

        }
        return res;
    }
    
}
