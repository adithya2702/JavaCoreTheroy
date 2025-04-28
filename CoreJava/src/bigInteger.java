//It is used to store large data
import java.math.BigDecimal;
import java.math.BigInteger;
public class bigInteger {

    public static void main(String[] args) {
        BI();
        BD();
        //System.out.println(fact(1252));
    }
    static void BI() {
        //Range of BigInteger is (-2^Integer.MAX_VALUE , 2^Integer.MAX_VALUE)
        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(6); // convert int/long to BI
        int c = B.intValue(); // convert BI to int
        BigInteger C = new BigInteger("2345678654325678976543256789");//String to BI
        BigInteger X = new BigInteger("4536789765432");

        // constants
        BigInteger D = BigInteger.TEN;

        // operations
        BigInteger s = C.add(X);

        BigInteger m = C.multiply(X);

        BigInteger sub = C.subtract(X);

        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);
        System.out.println(d);
        System.out.println(rem);
        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }
    }
    static void BD() {
        double x = 0.03;
        double y= 0.04;
        System.out.println(y-x);//it not gives the 0.01 check because float and double are floating point numbers have an error of 10^-19, so we use BigDecimal

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");

        // operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
        System.out.println(con);
    }
    static BigInteger fact(int n){
        BigInteger ans = BigInteger.valueOf(1);
        for(int i=2;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
