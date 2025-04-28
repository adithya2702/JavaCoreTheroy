import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutationsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        //permutation("",s);
        System.out.println(permutationRes("",s));
        System.out.println(permutationCount("",s));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String left = p.substring(0,i);
            String right = p.substring(i);
            permutation(left+c+right,up.substring(1));
        }
    }
    static List<String> permutationRes(String p,String up){
        if(up.isEmpty()){
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> ans =new ArrayList<>();
        char c =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i);
            ans.addAll(permutationRes(first+c+last,up.substring(1)));

        }
        return ans;
    }
    static int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char c =up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String left = p.substring(0,i);
            String right = p.substring(i);
            count = count+permutationCount(left+c+right,up.substring(1));
        }
        return count;
    }
}
