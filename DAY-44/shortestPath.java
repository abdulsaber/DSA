/**
 * shortestPath
 */
public class shortestPath {

    public static void path(int src, boolean vis[], int dis[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis[src] = true;
		dis[src] = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur+" ");
			
			for(Integer neighbor: a.get(cur)) {
				if(!vis[neighbor]) {
					dis[neighbor] = dis[cur] + 1;
					q.add(neighbor);
					vis[neighbor] = true;
				}
			}
		}
	}
}