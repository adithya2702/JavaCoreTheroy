import java.util.Arrays;

public class frogKJumps {
    public static void main(String[] args) {
        frogKJumps fj = new frogKJumps();
        int[] a = {30,10,60,10,60,50};
        int k = 3;
//        System.out.println(fj.findRec(a, a.length - 1, k));
//        int[] dp = new int[a.length];
//        Arrays.fill(dp, -1);
//        System.out.println(fj.findMemo(dp, a, a.length - 1, k));
        //System.out.println(fj.findTab(a, k));
        System.out.println(fj.findSO(a,k));
    }
    //Recursion
    int findRec(int[] a, int index, int k) {
        if (index == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (i - 1 < index) {
                int jumps = findRec(a, index - i, k) + Math.abs(a[index] - a[index - i]);
                min = Math.min(min, jumps);
            }
        }
        return min;
    }

    //Memorization
    int findMemo(int[] dp, int[] a, int index, int k) {
        if(index==0) return 0;
        if (dp[index] != -1) return dp[index];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (i - 1 < index) {
                int jumps = findMemo(dp, a, index - i, k) + Math.abs(a[index] - a[index - i]);
                min = Math.min(min, jumps);
            }
            dp[i] = min;
        }
        return dp[index];
    }

    //Tabular
    int findTab(int[] a, int k) {
        int[] dp = new int[a.length];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (j - 1 < i) {
                    int jumps = dp[i-j] + Math.abs(a[i] - a[i - j]);
                    min = Math.min(min, jumps);
                }
            }
            dp[i] = min;
        }
        return dp[a.length-1];
    }

    //Space Optimized
    //This cannot be solved with O(1) space this requires a space of k array in worst case its space complexity is O(n)
    int findSO(int[] a,int k){
        int prev2 = Integer.MAX_VALUE;
        int prev=0;
        int[] dp = new int[k];
        dp[0]=0;
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i=1;i<a.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(j-1<i){
                    int curr =  prev+Math.abs(a[i]-a[i-j]);
                    min=Math.min(min,curr);
                }
            }
            dp[i]=min;
            prev2 = prev;
            prev=dp[i];
        }
        return prev;
    }
}
