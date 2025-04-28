package Strings;
import java.util.HashSet;
import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(isPangram(s));
    }
    static boolean isPangram(String s){
        if(s.length()<26) return false;
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                h.add(s.charAt(i));
        }
        return h.size() == 26;
    }
}
