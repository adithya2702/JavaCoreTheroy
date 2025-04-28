package all;
import java.util.Scanner;
public class ratsFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n= sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(food(r,unit,n,a));
    }
    public static int food(int r,int unit,int n,int[] a){
        if(n==0) return -1;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum<unit*r) {
                sum += a[i];
                count++;
            }
            else{
                break;
            }
        }
        if(sum<unit*r){
            return 0;
        }
        return count;
    }
}