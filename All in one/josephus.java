import java.util.Scanner;
public class josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = (int) (Math.log(n)/Math.log(2));
        System.out.println(c);
        int a=128>>c;
        System.out.println(a);
        int ans = (n-a)*2+1;
        System.out.println(ans);
    }
}
