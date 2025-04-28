import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class longSubstringWithoutRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> st = new HashSet<>();
        int r =0;
        int l=0;
        int maxl = 0;
        while(r<s.length()){
            if(!st.contains(s.charAt(r))){
                st.add(s.charAt(r));
                maxl = Math.max(maxl,st.size());
                r++;
            }
            else{
                st.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(maxl);
    }
}