import java.util.Scanner;
public class numberSeies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=0,base=1;
        while(n>0) {
            if (n % 3 == 0) {
                num = num+5*base;
                n=n/3-1;
            }
            if (n % 3 == 1) {
                num = num+2*base;
                n=n/3;
            }
            if (n % 3 == 2) {
                num = num+3*base;
                n=n/3;
            }
            base*=10;
        }
        System.out.println(num);
    }
}
