import java.util.Arrays;

public class primsGraph {
    private static final int INF =Integer.MAX_VALUE;
    public static void main(String[] args) {
        int V = 5; // Number of vertices

        int[][] graph = {
                {0, 1, 0, 5, 5},
                {1, 0, 2, 3, 4},
                {0, 2, 0, 0, 5},
                {5, 3, 0, 0, 5},
                {5, 4, 5, 5, 0}
        };

        primMST(graph, V);
    }

    static void primMST(int[][] graph,int V){
        int[] parent = new int[V];
        int[] keys = new int[V];
        boolean isMST[]=new boolean[V];

        Arrays.fill(keys,INF);
        keys[0]=0;
        parent[0]=-1;

        for(int count=0;count<V-1;count++){
            int u=min(keys,isMST,V);
            isMST[u]=true;
            for(int v=0;v<V;v++){
                if(graph[u][v]!=0 && !isMST[v] && graph[u][v]<keys[v]){
                    parent[v]=u;
                    keys[v]=graph[u][v];
                }
            }
        }
        System.out.println("Edge\tWeight");
        for(int i=1;i<V;i++){
            System.out.println(parent[i]+"->"+i+"\t"+graph[i][parent[i]]);
        }
    }

    static int min(int[]keys,boolean[]isMST,int V){
        int minKey=INF;
        int index=-1;
        for(int i=0;i<V;i++){
            if(!isMST[i] && keys[i]<minKey){
                minKey = keys[i];
                index=i;
            }
        }
        return index;
    }
}
