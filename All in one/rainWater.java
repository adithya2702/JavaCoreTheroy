import java.util.Scanner;
import java.util.Arrays;
public class rainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<n-2;i++){
            sum+=(a[n-2]-a[i]);
        }
        System.out.println(sum);
    }
}
