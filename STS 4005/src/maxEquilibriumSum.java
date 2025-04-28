import java.util.Scanner;
public class maxEquilibriumSum {
    static int maxsum(int[]arr,int n){
        int res = Integer.MIN_VALUE;
        int presum=0;
        int tsum=0;
        for(int i=0;i<n;i++){
            tsum+=arr[i];
        }
        for(int i=0;i<n;i++){
            tsum-=arr[i];
            if(tsum==presum){
                res=Math.max(res,presum);
            }
            presum+=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();

        System.out.println(maxsum(arr,n));
    }


}
