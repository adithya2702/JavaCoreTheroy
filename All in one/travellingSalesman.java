import java.util.*;
public class travellingSalesman{
    static final int INF = 1000000;
    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        tsp1(graph);
    }

    static void tsp1(int[][]graph){
        int n=graph.length;
        int[][]dp = new int[1<<n][n];
        for(int[] row:dp){
            Arrays.fill(row,INF);
        }
        dp[1][0]=0;

        for(int mask=1;mask<(1<<n);mask++){
            for(int i=0;i<n;i++){
                if((mask & (1<<i))!=0){
                    for(int j=0;j<n;j++){
                        if((mask & (1<<j))!=0 && j!=i){
                            dp[mask][i]=Math.min(dp[mask][i],dp[mask^(1<<i)][j]+graph[j][i]);
                        }
                    }
                }
            }
        }
        int minCost=INF;
        for(int i=0;i<n;i++){
            minCost=Math.min(minCost,dp[(1<<n)-1][i]+graph[i][0]);
        }
        System.out.println(minCost);
    }
}