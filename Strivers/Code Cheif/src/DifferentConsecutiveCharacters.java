import java.util.Scanner;

public class DifferentConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int len = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(min(s));
        }
    }
    public static int min(String s) {
        if (s.length() < 2) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
