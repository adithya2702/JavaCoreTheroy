import java.util.Scanner;
public class jumpGameToReachLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean reach = false;
        for(int i=0; i<n;){
            if(a[i]==0&& a[n-1]!=0){
                reach = false;
                break;
            }
            else{
                reach=true;
            }
            i+=a[i];
        }
        System.out.print(reach);
    }
}