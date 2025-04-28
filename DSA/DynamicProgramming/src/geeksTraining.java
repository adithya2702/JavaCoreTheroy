import java.util.Arrays;

public class geeksTraining {
    public static void main(String[] args) {
        int[][] a = {{1,2,5},{3,1,1},{3,2,0}};
        //System.out.println(find(a,a.length-1,-1));

        int[][] dp = new int[a.length][4];
        for(int i=0;i<a.length;i++){
            Arrays.fill(dp[i],-1);
        }
        //System.out.println(find2(dp,a,a.length-1,3));
        //System.out.println(find3(a));
        System.out.println(find4(a));
    }

    //Recursion
    static int find(int[][] a,int day,int last){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last) max=Math.max(max,a[0][i]);
            }
            return max;
        }
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last) {
                int points = a[day][i] + find(a, day - 1, i);
                max = Math.max(points, max);
            }
        }
        return max;
    }

    //Memorization
    static int find2(int[][] dp,int[][] a,int day,int last){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last) max=Math.max(max,a[0][i]);
            }
            return max;
        }
        if(dp[day][last]!=-1) return dp[day][last];
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last) {
                int points = a[day][i] + find2(dp,a,day-1,i);
                max = Math.max(points, max);
            }
        }
        return dp[day][last]=max;
    }

    //Tabular
    static int find3(int[][] a){
        int[][] dp = new int[a.length][4];
        dp[0][0] = Math.max(a[0][1],a[0][2]);
        dp[0][1] = Math.max(a[0][0],a[0][2]);
        dp[0][2] = Math.max(a[0][0],a[0][1]);
        dp[0][3] = Math.max(a[0][1],Math.max(a[0][2],a[0][0]));

        for(int day=1;day<a.length;day++){
            for(int lastTask=0;lastTask<4;lastTask++){
                int max=0;
                for(int task=0;task<3;task++) {
                    if (task != lastTask) {
                        int points = a[day][task] + dp[day-1][task];
                        max = Math.max(points, max);
                    }
                }
                dp[day][lastTask]=max;
            }
        }
        return dp[a.length-1][3];
    }
    //Space Optimized
    static int find4(int[][] a){
        int[] prev = new int[4];
        prev[0] = Math.max(a[0][1],a[0][2]);
        prev[1] = Math.max(a[0][0],a[0][2]);
        prev[2] = Math.max(a[0][0],a[0][1]);
        prev[3] = Math.max(a[0][1],Math.max(a[0][2],a[0][0]));

        for(int day=1;day<a.length;day++){
            int[] temp = new int[4];
            for(int lastTask=0;lastTask<4;lastTask++){
                int max=0;
                for(int task=0;task<3;task++){
                    if(task!=lastTask){
                        int points = a[day][task]+prev[task];
                        max = Math.max(points,max);
                    }
                }
                temp[lastTask]=max;
            }
            prev=temp;
        }
        return prev[3];
    }
    //we can do this also for space optimization
    static int find5(int[][] a){
        int[] prev = new int[4];
        prev[0] = Math.max(a[0][1],a[0][2]);
        prev[1] = Math.max(a[0][0],a[0][2]);
        prev[2] = Math.max(a[0][0],a[0][1]);
        prev[3] = Math.max(a[0][1],Math.max(a[0][2],a[0][0]));

        for(int day=1;day<a.length;day++){
            int[] temp = new int[4];
            for(int lastTask=0;lastTask<4;lastTask++){
                for(int task=0;task<3;task++){
                    if(task!=lastTask){
                        temp[lastTask] = Math.max(a[day][task]+prev[task],temp[lastTask]);
                    }
                }
            }
            prev=temp;
        }
        return prev[3];
    }
}