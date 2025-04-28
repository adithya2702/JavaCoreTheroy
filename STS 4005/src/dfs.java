import java.util.*;
class Graph{
    LinkedList<Integer> adj[];
    Graph(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    void insert(int s, int d){
        adj[s].add(d);
        adj[d].add(s);
    }
    void DFS(int source, int v){
        Stack<Integer> q = new Stack<>();
        boolean vis[] = new boolean[v];
        q.add(source);
        vis[source] = true;
        while(!q.isEmpty()){
            int n=q.pop();
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
public class dfs{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();
        Graph g = new Graph(v);
        for (int i=0; i<v; i++){
            int s= sc.nextInt();
            int d = sc.nextInt();
            g.insert(s,d);
        }
        int source = sc.nextInt();
        g.DFS(source,v);
    }
}
