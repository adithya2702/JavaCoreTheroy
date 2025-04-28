public class pattern1 {
    public static void main(String[] args) {
        pattern(1);
    }
    static void pattern(int n){
        if(n==0){
            return;
        }
        for(int i=n;i>0;i--){
            System.out.print("*");
        }
        System.out.println();
        pattern(n-1);
    }
}
