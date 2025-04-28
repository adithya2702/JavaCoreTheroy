package all;
import java.util.Scanner;
public class ipaddressString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] s2 = s.split("\\.");
        if(s2.length!=4){
            System.out.println(false);
        }
        int []a = new int[4];
        for(int i=0;i<a.length;i++){
            try {
                a[i] = Integer.valueOf(s2[i]);
            }
            catch(NumberFormatException e){
                System.out.println(false);
                return;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0 || a[i]>255){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}