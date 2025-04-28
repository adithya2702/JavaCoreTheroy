import java.util.Scanner;
public class arraySorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        System.out.println(isSorted(a));
    }
    static boolean isSorted(int[]a ){
        return isSmall(a,0);
    }
    static boolean isSmall(int []a,int p){
        if(p==a.length-1){
            return true;
        }
        return a[p]<a[p+1] && isSmall(a,p+1);
    }
}
