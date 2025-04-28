import java.util.Scanner;
public class cyclicRotationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        r=r%n;
        int[] a2 = new int[r];
        for (int i = 0; i < r; i++) {
            a2[i] = a[n - r + i];
        }
        for (int i = n - 1; i >= r; i--) {
            a[i] = a[i - r];
        }
        for (int i = 0; i < r; i++) {
            a[i] = a2[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
