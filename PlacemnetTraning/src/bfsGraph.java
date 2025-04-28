import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class bfsGraph {
    static void bfs(int [][] arr,int v){
        boolean [] a = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<v; i++){
            if(!a[i]) {
                q.add(i);;
                a[i] = true;
                while (!q.isEmpty()) {
                    int cur = q.poll();
                    System.out.print(cur+ " ");
                    for (int j = 0; j < v; j++) {
                        if (arr[cur][j] == 1 && !a[j]) {
                            q.add(j);
                            a[j] = true;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();// nodes == vertex
        int e = sc.nextInt();// edges == lines
        int[][] adjMat = new int[v][v];
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            adjMat[s][d] = 1;
            adjMat[d][s] = 1;
        }
        bfs(adjMat,v);
    }
}