package Strings;
import java.util.Scanner;
import java.util.HashMap;
public class isomorphic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2=sc.nextLine();
        System.out.print(isomorphic(s1,s2));
    }
    static boolean isomorphic(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Character> m = new HashMap<>();
        HashMap<Character,Boolean> m2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(m.containsKey(s1.charAt(i))){
                if(m.get(s1.charAt(i))!=s2.charAt(i))
                    return false;
            }
            else{
                if(m2.containsKey(s2.charAt(i)))
                    return false;
                else{
                    m.put(s1.charAt(i),s2.charAt(i));
                    m2.put(s2.charAt(i),true);
                }

            }
        }
        return true;
    }
}
