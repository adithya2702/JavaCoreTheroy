import java.util.Scanner;

public class knapSack01DP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];
        for(int j = 0; j < n; j++) {
            p[j] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        int w[] = new int[n1];
        for(int i = 0; i < n1; i++) {
            w[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        int dp[][] = new int[n+1][W+1]; // Corrected initialization
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                if(w[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j], p[i-1] + dp[i-1][j-w[i-1]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}
