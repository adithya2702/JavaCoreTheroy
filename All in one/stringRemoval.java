import java.util.Scanner;
public class stringRemoval {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        String s2=sc.nextLine();
        removal(s,s2);
    }
    public static void removal(String s,String s2){
        for(int j=0;j<s2.length();j++) {
            String c = Character.toString(s2.charAt(j));
            s=s.replace(c,"");
        }
        System.out.println(s);
    }
}
