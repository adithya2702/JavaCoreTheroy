import java.util.Scanner;
public class maxSubArraySumKadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       int max=Integer.MIN_VALUE,sum=0;
        //  This is min time complexity kadane's algo
        for(int i=0; i<n; i++) {
            sum += a[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        //this is n^2 time complexity
//        int maxsum=a[0];
//        for(int i=0;i<n; i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum=sum+a[j];
//                if(sum>maxsum){
//                    maxsum=sum;
//                }
//            }
//        }
//        System.out.println(maxsum);
       System.out.println(max);
    }
}
