import java.util.Scanner;
public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long m = sc.nextLong();
        long sum=0,dig=0,sum1=0;
        while(n>0){
            dig = n%10;
            sum+=(long)Math.pow(10,dig);
            n=n/10;
        }
        while(m>0){
            dig = m%10;
            sum1+=(long)Math.pow(10,dig);
            m=m/10;
        }
        if(sum==sum1)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
