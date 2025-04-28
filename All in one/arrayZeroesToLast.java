import java.util.Scanner;
public class arrayZeroesToLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        chocolate(a,n);
    }
    public static void chocolate(int[]a,int n){
        int count=0;
        for(int i=0;i<n; i++){
            if(a[i]==0) count++;
        }
        int a2[] = new int[n];
        for(int i=0,j=0;i<n;i++){
            if(a[i]!=0) {
                a2[j] = a[i];
                j++;
            }
        }
        for(int i:a2){
            System.out.print(i+" ");
        }
    }
}
