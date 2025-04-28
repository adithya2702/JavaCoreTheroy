
import java.util.*;
class graph{
    LinkedList<Integer> adj[];
    graph(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    void insert(int s, int d){
        adj[s].add(d);
        adj[d].add(s);
    }
    void BFS(int source, int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(source);
        vis[source] = true;
        while(!q.isEmpty()){
            int n=q.poll();
            System.out.print(n);
            for(int i:adj[n]){
                if(vis[i] != true){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    }
}
public class bfs{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();
        graph g = new graph(v);
        for (int i=0; i<v; i++){
            int s= sc.nextInt();
            int d = sc.nextInt();
            g.insert(s,d);
        }
        int source = sc.nextInt();
        g.BFS(source,v);
    }
}