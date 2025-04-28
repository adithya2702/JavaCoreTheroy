public class noOfDigits {
    public static void main(String[] args) {
        System.out.println(decimal(6452));
        System.out.println(binary(7));
        System.out.println(powerOf2(8));
        System.out.println(power(3,4));
    }
    public static int decimal(int n){
        return (int)Math.log10(n)+1;
    }
    public static int binary(int n){
        return (int)(Math.log(n) / Math.log(2)) +1;
    }
    public static boolean powerOf2(int n){
        return (n&(n-1))==0;
    }
    public static int power(int a,int b){
        int ans=1;
        int base=a;
        while(b>0){
            if((b&1)==1) {
                ans = ans * base;
            }
            base*=base;
            b=b>>1;
        }
        return ans;
    }
}
