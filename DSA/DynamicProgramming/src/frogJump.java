import java.util.Arrays;

public class frogJump {
    public static void main(String[] args) {
        frogJump fj = new frogJump();
        int[] a = {30,10,60,10,60,50};
        //System.out.println(fj.findRec(a, a.length-1));
        int dp[] = new int[a.length];
        Arrays.fill(dp,-1);
        //System.out.println(fj.findMemo(dp,a,a.length-1));
        //System.out.println(fj.findTab(a));
        System.out.println(fj.findSO(a));
    }
    //Recursion
    int findRec(int[]a,int index){
        if(a.length==0) return 0;
        int right = Integer.MAX_VALUE;
        if(index==0)return 0;
        int left = findRec(a,index-1)+Math.abs(a[index]-a[index-1]);
        if(index>1){
            right = findRec(a,index-2)+Math.abs(a[index]-a[index-2]);
        }
        return Math.min(right,left);
    }
    //Memorization
     int findMemo(int[] dp,int[] a,int index){
        if(a.length==0) return 0;
        int right = Integer.MAX_VALUE;
        if(index==0) return 0;
        if(dp[index]!=-1) return dp[index];
        int left = findMemo(dp,a,index-1)+Math.abs(a[index]-a[index-1]);
        if(index>1){
            right = findMemo(dp,a,index-2)+Math.abs(a[index]-a[index-2]);
        }
        return dp[index]= Math.min(right,left);
    }
    //Tabular
    int findTab(int[] a){
        if (a.length == 0) return 0;
        if (a.length == 1) return 0;
        int[] dp = new int[a.length];
        dp[0]=0;
        int right=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            int left = dp[i-1]+Math.abs(a[i]-a[i-1]);
            if(i>1) {
                right = dp[i - 2] + Math.abs(a[i] - a[i - 2]);
            }
            dp[i]=Math.min(left,right);
        }
        return dp[dp.length-1];
    }
    //SpaceOptimized
    int findSO(int[]a){
        if(a.length==0) return 0;
        if(a.length==1) return 1;
        int prev2 = Integer.MAX_VALUE;
        int prev=0;
        for(int i=1;i<a.length;i++){
            int left = prev+Math.abs(a[i]-a[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                right = prev2+Math.abs(a[i]-a[i-2]);
            int curr = Math.min(left,right);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
//Way 2 in a order
//    //Recursion
//    static int findMinCost(int[]arr,int n){
//        if(n==0){
//            return 0;
//        }
//        int left = findMinCost(arr,n-1) + Math.abs(arr[n]-arr[n-1]);
//        int right = Integer.MAX_VALUE;
//        if(n>1)
//            right = findMinCost(arr,n-2) + Math.abs(arr[n]-arr[n-2]);
//
//        return Math.min(left,right);
//    }
//
//    //Memoization
//    static int finMinCost1(int[]arr,int[] dp,int n){
//        if(n==0){
//            return 0;
//        }
//        if(dp[n]!=-1){
//            return dp[n];
//        }
//        int left = finMinCost1(arr,dp,n-1) + Math.abs(arr[n]-arr[n-1]);
//        int right = Integer.MAX_VALUE;
//        if(n>1){
//            right = finMinCost1(arr,dp,n-2) + Math.abs(arr[n] - arr[n-2]);
//        }
//        return dp[n]= Math.min(left,right);
//
//    }
//
//    //Tabulation
//    static int findMinCost2(int[]arr,int[]dp,int n){
//
//        dp[0] = 0;
//
//        for(int i = 1;i<n;i++){
//            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
//            int right = Integer.MAX_VALUE;
//            if(i>1){
//                right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
//            }
//            dp[i] = Math.min(left,right);
//        }
//
//        return dp[n-1];
//    }
//
//    //space optimized
//
//    static int findMinCost3(int[]arr,int n){
//        int prev1 = 0;
//        int prev2 = 0;
//
//        for(int i = 1;i<n ;i++){
//            int first = prev1 + Math.abs(arr[i]-arr[i-1]);
//            int second = Integer.MAX_VALUE;
//            if(i>1){
//                second = prev2 + Math.abs(arr[i]-arr[i-2]);
//            }
//            int curr = Math.min(first,second);
//            prev1 = prev2;
//            prev2 = curr;
//        }
//        return prev2;
//    }
