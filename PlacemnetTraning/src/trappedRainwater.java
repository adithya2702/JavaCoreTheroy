import java.util.Scanner;
public class trappedRainwater {
    static void water(int []a){
        int n= a.length;
        int [] l = new int[n];
        int [] r = new int[n];
        l[0] = a[0];
        for(int i=1;i<n;i++){
            l[i] = Math.max(l[i-1],a[i]);
        }
        r[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--){
            r[i] = Math.max(r[i+1],a[i]);
        }
        int ans =0;
        for(int i=0; i<n; i++){
            ans += Math.min(l[i],r[i])-a[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;  i++){
            arr[i] = sc.nextInt();
        }
        water(arr);
    }
}