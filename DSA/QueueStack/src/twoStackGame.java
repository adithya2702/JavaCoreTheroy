import java.util.Arrays;
public class twoStackGame {
    public static void main(String[] args) {
        int[]a = {4,2,4,6,1};
        int[]b ={2,1,8,5};
        System.out.println(game(a,b,0,0,10)-1);
    }
    public static int game(int[] a,int[] b,int sum,int count,int maxSum){
        if(sum>maxSum || a.length==0 || b.length==0){
            return count;
        }
        return Math.max(game(Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1,maxSum),
                        game(a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1,maxSum));
    }
}
