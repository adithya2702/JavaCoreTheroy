import java.util.Scanner;
public class adjMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int v = sc.nextInt();// nodes == vertex
        int e = sc.nextInt();// edges == lines
        int [][] adjMat = new int [v][v];
        for(int i=0; i<e; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            adjMat[s][d] = 1;
            adjMat[d][s] = 1;
        }
        for(int i=0;i<v;i++){
            for(int j=0; j<v;j++){
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}