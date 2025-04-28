import java.util.Scanner;
public class numbersPrimeSumAlsoPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int sum=2,count=0;
        for(int i=3;i<n;i++){
            if(isprime(i)){
                sum+=i;
                if(sum>n)
                    break;
                if(isprime(sum))
                    count++;
            }
        }
        System.out.println(count);
        //System.out.println(prime(n));
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
   // This is best time complexity code for prime number
    public static int prime(int n){
        if(n<2)
            return -1;
        if(n==2||n==3)
            return 1;
        if(n%2==0)
            return -1;
        if(n%6!=1&&n%6!=5)
            return -1;
        for(int i=3;i<Math.sqrt(n);i++){
            if(n%i==0)
                return -1;
        }
        return 1;
    }
}
