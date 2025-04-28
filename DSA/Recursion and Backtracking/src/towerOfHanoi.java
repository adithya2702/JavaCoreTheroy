public class towerOfHanoi {
    public static void main(String[] args) {
        tower(5,'a','b','c');
    }
    static void tower(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+" "+c);
            return;
        }
        tower(n-1,a,c,b);
        tower(1,a,b,c);
        tower(n-1,b,a,c);
    }
}
