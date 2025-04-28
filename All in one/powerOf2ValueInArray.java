import java.util.Scanner;
public class powerOf2ValueInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            if(div(a[i])){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
    public static boolean div(int num){
        while(num%2==0){
            num=num/2;
        }
        return false;
    }
}
//[3,5,13,15]sum=20