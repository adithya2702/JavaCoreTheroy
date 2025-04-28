import java.util.Arrays;
import java.util.Scanner;

public class climbSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(dp,n));
        System.out.println(count2(dp,n));
        System.out.println(count3(n));
    }
    //Memorization
    public static int count(int[] dp,int n){
        if(n<2) return 1;
        if(dp[n]!=-2) return dp[n];
        return dp[n]= count(dp,n-1)+count(dp,n-2);
    }
    //Tabular
    public static int count2(int[] dp,int n){
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    //Space reduce
    public static int count3(int n){
        int prev=1;
        int prev2=1;
        for(int i=2;i<n+1;i++){
            int curr = prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }

}
