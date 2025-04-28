/*
    1-001-5
    2-010-5^2=25
    3-011-5^2+5=30
    4-100-5^3=125
 */

public class magicNumber {
    public static void main(String[] args) {
        System.out.println(magic(5));
    }
    public static int magic(int n){
        int sum=0;
        int base=5;
        while(n>0){
            int last=n&1;
            sum+=last*base;
            n=n>>1;
            base=base*5;
        }
        return sum;
    }
}
