//DP[i] = DP[i-1] + (i-1)*(DP[i-2])
import java.util.Scanner;
public class subArrayParingGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int i;
        int[] dp = new int[n+1];
        if(n>10 ||n<1){
            return;
        }
        if(n%2!=0){
            System.out.print("1");
        }
        else{
            dp[0]=0;
            dp[1]=1;
            dp[2]=2;
            for(i=3;i<n+1;i++){
                dp[i] = dp[i-1]+(i-1)*dp[i-2];
            }
            System.out.println(dp[n]);
        }
    }
}
