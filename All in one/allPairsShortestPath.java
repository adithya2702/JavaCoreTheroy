public class allPairsShortestPath {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int V=4;
        int[][] graph = {
                { 0,3,8,INF},
                { INF,0,INF,1 },
                { INF,4,0,INF },
                { 2,INF,5,0 }
        };
        allPair(graph,V);
    }
    public static void allPair(int[][] graph,int V){
        int[][] dist= new int[V][V];
        for(int i=0;i<V;i++){
            System.arraycopy(graph[i],0,dist[i],0,V);
        }

        for(int k=0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(dist[i][k]!=INF && dist[k][j]!=INF && dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(dist[i][j]==INF){
                    System.out.print("INF\t");
                }
                else{
                    System.out.print(dist[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
