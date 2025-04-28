import java.util.Scanner;

public class maneuvering {
    static int countPath(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return countPath(n - 1, m) + countPath(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(countPath(n, m));
    }
}