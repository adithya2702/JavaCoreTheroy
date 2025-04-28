import java.util.Scanner;
public class bestToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int diff=0;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(a[j]-a[i]>diff){
                    diff=a[j]-a[i];
                }
            }
        }
        System.out.println(diff);
    }
}