public class gcdLcm {
    public static void main(String[] args) {
        System.out.println(hcf(30,40));
        System.out.println(lcm(30,40));
    }
    static int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/hcf(a,b);
    }
}
