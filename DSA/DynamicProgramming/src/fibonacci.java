import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(fibo(dp,n));
        //System.out.println(fibo2(dp,n));
        System.out.println(fibo3(n));
    }
    //Recursion
    static int find(int n){
        if(n<2) return n;
        return find(n-1)+find(n-2);
    }
    //Memorization approach
//    public static int fibo(int[] dp,int n){
//        if(n<2){
//            return n;
//        }
//        if(dp[n]!=-1) return dp[n];
//        return dp[n] = fibo(dp,n-1)+fibo(dp,n-2);
//    }
//
//    //Tabular approach
//    public static int fibo2(int[] dp,int n){
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<n+1;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }

    //Space modified approach
    public static int fibo3(int n){
        int prev2=0;
        int prev=1;
        for(int i=2;i<n+1;i++){
            int curr = prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
