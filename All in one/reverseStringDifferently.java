import java.util.Scanner;
public class reverseStringDifferently {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s2 = "";
        String s3="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='A' && s.charAt(i)<='z') {
                s3+=s.charAt(i);
            }
        }
        for(int i=0,j=0;i<s.length(); i++) {
            if (((s.charAt(i) < 'A' ||s.charAt(i) > 'z'))) {
                s2 += s.charAt(i);
            } else {
                s2 += s3.charAt(j);
                j++;
            }
        }
        System.out.println(s2);
    }
}
