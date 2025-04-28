import java.util.Arrays;

public class houseRobber {
    public static void main(String[] args) {
        int[] a = {2,7,9,3,1};//12
        //System.out.println(find(a,a.length-1));

        int[] dp = new int[a.length];
        Arrays.fill(dp,-1);
        //System.out.println(find2(dp,a,a.length-1));
        System.out.println(find3(a));
        //System.out.println(find4(a));
    }

    //Recursion
    static int find(int[] a,int n){
        if(n==0) return a[0];
        if(n<0) return 0;
        int pick = a[n]+find(a,n-2);
        int notPick = find(a,n-1);
        return Math.max(pick,notPick);
    }
    //Memorization
    static int find2(int[] dp,int[] a,int n){
        if(n==0) return a[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick = a[n]+find2(dp,a,n-2);
        int notPick = find2(dp,dp,n-1);
        return dp[n]=Math.max(pick,notPick);
    }
    //Tabular
    static int find3(int[] a){
        int[] dp = new int[a.length];
        Arrays.fill(dp,-1);
        dp[0]=a[0];
        for(int i=1;i<a.length;i++){
            int pick=a[i];
            if(i>1)
                pick += dp[i - 2];
            int notPick = dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[a.length-1];
    }
    //Space Optimized
    static int find4(int[] a){
        int prev2 = -1;
        int prev=a[0];
        for(int i=1;i<a.length;i++){
            int pick=a[i];
            if(i>1)
                pick +=prev2;
            int notPick = prev;
            int curr=Math.max(pick,notPick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
