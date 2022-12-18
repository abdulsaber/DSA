public class cycle {
    public static boolean isCyclePresent(int src, boolean vis[], int parent) {
		vis[src] = true;
		
		for(Integer neighbor: a.get(src)) {
			if(!vis[neighbor]) {				
				if(isCyclePresent(neighbor, vis, src)) return true;
			} else if(neighbor != parent){
				return true;
			}
		}
		
		return false;
	}
    
}
