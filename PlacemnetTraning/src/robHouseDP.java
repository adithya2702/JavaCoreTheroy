import java.util.Scanner;
public class robHouseDP {
    static int robb(int []a){
        int n= a.length;
        if(n==0) {
            return 0;
        }
        if(n==1){
            return a[0];
        }
        if(n==2){
            return Math.max(a[0],a[1]);
        }
        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = Math.max(a[0],a[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(a[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(robb(arr));
    }
}
