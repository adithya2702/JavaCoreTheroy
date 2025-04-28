package all;
import java.util.Scanner;
public class replaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();
        System.out.println(s);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char [] sa = s.toCharArray();//***** String to char array
        for(int i=0;i<sa.length;i++){
            if(sa[i]==c1){
                sa[i]=c2;
            }
        }
        s = new String(sa);//****** Convert char array to string
        System.out.println(s);

       //**** Convert char to string
        String s3 = Character.toString(c1);
    }
}