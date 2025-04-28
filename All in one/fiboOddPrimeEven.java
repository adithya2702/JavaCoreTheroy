import java.util.Scanner;
public class fiboOddPrimeEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos=sc.nextInt();
        if(pos%2==0){

        }
        else{

        }
    }
    public static int fibo(int num){
        if(num==1||num==2) return 1;
        else return (fibo(num-1)+fibo(num-2));
    }
    public static int prime(int num){
        int count =0,first=2;
        while(count!=first){
            if(isprime(num)){
                count++;
            }
            num++;
        }
        return num;
    }
    public static boolean isprime(int num){
        return false;
    }
}
