public class basic {
    public static void main(String[] args) {
        //System.out.println(fact(5));
        //System.out.println(sumOfDigits(12345));
        //System.out.println(prodOfDigits(12345));
        //preIncPostInc(5);
        //reversePrint(123);
        //System.out.println(reverseNumber(356));
        //System.out.println(palindrome(121));
        //System.out.println(countZeroes(10203));

    }
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
    public static int prodOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10*prodOfDigits(n/10);
    }
    public static void preIncPostInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        preIncPostInc(n--);//Check difference one after one
        //preIncPostInc(--n);
    }
    public static void reversePrint(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reversePrint(n/10);
    }
    public static int reverseNumber(int n){
        int digits = (int) (Math.log10(n))+1;
        return helperForReverse(n,digits);
    }
    public static int helperForReverse(int n,int digits){
        if(n%10 == n){
            return n;
        }
        return n%10*(int)Math.pow(10,digits-1)+helperForReverse(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return reverseNumber(n) == n;
    }
    static int countZeroes(int n){
        return helperCount(n,0);
    }
    static int helperCount(int n,int z){
        if(n==0){
            return z;
        }
        return (n % 10 == 0) ? helperCount(n / 10, z+1) : helperCount(n / 10, z);
    }
}
