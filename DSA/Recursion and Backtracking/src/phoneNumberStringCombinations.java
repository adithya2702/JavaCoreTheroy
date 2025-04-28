import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class phoneNumberStringCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(phone("",Integer.toString(n)));
        //possibleWords(Integer.toString(n),"");
    }
    static String [] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> phone(String p,String up){
        if(up.isEmpty()){
            List<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> outer = new ArrayList<>();
        String s=keypad[up.charAt(0)-'0'];
        for(int i=0;i<s.length();i++){
            outer.addAll(phone(p+s.charAt(i),up.substring(1)));
        }
        return outer;
    }

   // this is best approach reduce space complexity
    static void possibleWords(String s, String ans) {
       if (s.isEmpty()) {
           System.out.println(ans);
           return;
       }
        String key = keypad[s.charAt(0) - '0'];
        for (int i = 0; i < key.length(); i++) {
            possibleWordsVertical(s, ans + key.charAt(i), 1);
        }
    }

    static void possibleWordsVertical(String s, String ans, int index) {
        if (index == s.length()) {
            System.out.println(ans);
            return;
        }

        String key = keypad[s.charAt(index) - '0'];
        for (int i = 0; i < key.length(); i++) {
            possibleWordsVertical(s, ans + key.charAt(i), index + 1);
        }
    }
}