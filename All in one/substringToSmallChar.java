import java.util.Scanner;
public class substringToSmallChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n= sc.nextInt();
        String [] a = new String[s1.length()/n+1];
        for(int i=0,j=0; i<s1.length();i+=n,j++){
            a[j] = s1.substring(i, Math.min(i + n, s1.length()));
        }
        for(String val:a){
            System.out.print(val+" ");
        }
    }
}
