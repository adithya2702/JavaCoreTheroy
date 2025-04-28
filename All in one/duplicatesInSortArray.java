import java.util.Scanner;
public class duplicatesInSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count=0;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]) {
                    count++;
                    temp=a[i];
                }
            }
        }
        if(count>0)
            System.out.println(temp);
    }
}
