import java.util.Scanner;
public class sumWithoutHighestLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum=0,  min=Integer.MAX_VALUE,  max=0;
        for(int i = 0; i<n; i++){
            sum+=a[i];
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println(sum-min-max);
    }
}
