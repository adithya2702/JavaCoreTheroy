import java.util.Scanner;

public class stringRemove {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        System.out.println(print(s));
    }
    static String print(String s){
        if(s.length()==0) return "";
        if(s.startsWith("apple")) return print(s.substring(5));
        else {
            return s.charAt(0)+print(s.substring(1));
        }
    }
}
//baappleedf
//baedf