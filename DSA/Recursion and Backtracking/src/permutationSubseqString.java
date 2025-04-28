import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutationSubseqString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(all("",s));
    }
    static List<String> all(String p, String up){
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char c =up.charAt(0);
        List<String> include = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            include.addAll(all(first+c+last,up.substring(1)));
        }
        List<String> ignore = all(p,up.substring(1));
        include.addAll(ignore);
        return include;
    }
}
