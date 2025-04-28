import java.util.Scanner;
public class findPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(find(a,1));
    }
    public static int find(int [] a,int num){
        for(int i=0; i<a.length; i++){
            if(a[i]==num) {
                num++;
                find(a,num);
            }
        }
        return num;
    }
}
