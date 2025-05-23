import java.util.*;
public class editDistanceDP {
    static int distance(String s, String t){
        int n= s.length();
        int m = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0){
                    dp[i][j] = j;
                }
                else if(j==0) {
                    dp[i][j] = i;
                }
                else if(t.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(distance(s1,s2));
    }
}
