import java.util.Scanner;
public class josephusTrap {
    static int joseph(int n, int k) {
        if(n == 1)
            return 1;
        else
            return (joseph(n-1,k)+k-1)%n+1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(joseph(n,k));
    }
}