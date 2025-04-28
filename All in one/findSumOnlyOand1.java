import java.util.Scanner;
public class findSumOnlyOand1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        while(n>0){
            num=conv(n);
            System.out.print(num+" ");
            n-=num;
        }
    }

    public static int conv(int n){
        int dig=0,ans=0,base=1;
        while(n>0){
            dig=n%10;
            if(dig!=0){
                ans=ans+base;
            }
            base*=10;
            n/=10;
        }
        return ans;
    }
}
