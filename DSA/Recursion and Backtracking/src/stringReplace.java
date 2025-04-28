import java.util.Scanner;

public class stringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(skip(s));
    }
    static String skip(String s){
        if(s.isEmpty()) return "";
        return (s.charAt(0)=='a')? skip(s.substring(1)):  s.charAt(0)+skip(s.substring(1));
    }
}
//abbacd
//bbcd