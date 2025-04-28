import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        binaryConv(n);
        evenOdd(n);
        System.out.println(uniqueEleArray(new int[]{1,2,3,2,1}));
        System.out.println(valueAtIndexInBinary(n,3));
    }
    public static void binaryConv(int n){
        StringBuilder sb = new StringBuilder();
        if(n==0) {
            System.out.println(0);
            return;
        }
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        System.out.println(sb.reverse());
    }
    public static void evenOdd(int n){
        if((n&1)==1) System.out.println("Odd");
        else System.out.println("Even");
    }
    public static int uniqueEleArray(int[]a){
        int sum=0;
        for (int j : a) {
            sum ^= j;
        }
        return sum;
    }
    public static int valueAtIndexInBinary(int n,int index){
        if((n&(1<<(n-1)))==0) return 1;
        else return 0;
    }

}
