import java.util.Scanner;
public class uniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int []a2 =new int[n];
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                    count++;
            }
            a2[i]=count;
        }
        for(int i=0; i<n; i++){
            if(a2[i]==1)
                System.out.println(a[i]);
        }
    }
}