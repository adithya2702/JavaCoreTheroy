import java.util.Arrays;

public class houseRobberCircular {
    public static void main(String[] args) {
        int[] a = {2,7,9,3,1};
        System.out.println(find4(a));
    }
    //Space optimized
    static int find4(int[] a){
        int lastPrev1 = -1;
        int prev1=a[0];
        int lastPrev2 = -1;
        int prev2 = a[1];
        for(int i=1,j=2;i<a.length-1;i++,j++){
            int pick1=a[i] + (i>1 ? lastPrev1 : 0);
            int notPick1 = prev1;
            int curr=Math.max(pick1,notPick1);
            lastPrev1=prev1;
            prev1=curr;
            int pick2=a[j] + (j>2 ? lastPrev2 : 0);
            int notPick2 = prev2;
            int curr1 = Math.max(pick2,notPick2);
            lastPrev2 = prev2;
            prev2 = curr1;
        }
        return Math.max(prev2,prev1);
    }
}
