import java.util.Scanner;

public class primeFactors {
    public static int prime(int n){
        if(n<1) return -1;
        int count=0;
        int i=2;
        while(count<n){
            if (isPrime(i)) {
                count++;
            }
            if (count < n) i++;
        }
        return i;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void primeFactors(int n){
        int i=1;
        while(n>1) {
            while (n % prime(i) == 0) {
                System.out.print(prime(i) +" ");
                n=n/prime(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        primeFactors(n);
    }
}