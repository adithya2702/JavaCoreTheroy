import java.util.Scanner;
public class elementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int s = sc.nextInt();
        System.out.println(find(a,s));

    }
    public static int find(int []a,int num){
        int x=0;
        for(int i=0; i<a.length; i++){
            x = (a[i] == num) ? 1 : 0;
        }
        return x;
    }
}
