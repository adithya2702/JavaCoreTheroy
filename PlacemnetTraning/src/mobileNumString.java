import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//public class mobileNumString {
//
//    public static List<String> letterCombinations(String digits) {
//        if (digits == null || digits.length() == 0) {
//            return Collections.emptyList();
//        }
//        Map<Character, String> mapping = new HashMap<>();
//        mapping.put('2', "abc");
//        mapping.put('3', "def");
//        mapping.put('4', "ghi");
//        mapping.put('5', "jkl");
//        mapping.put('6', "mno");
//        mapping.put('7', "pqrs");
//        mapping.put('8', "tuv");
//        mapping.put('9', "wxyz");
//
//        List<String> result = new ArrayList<>();
//        backtrack("", digits, mapping, result);
//        Collections.sort(result);
//        return result;
//    }
//
//    private static void backtrack(String combination, String digits, Map<Character, String> mapping, List<String> result) {
//        if (digits.length() == 0) {
//            result.add(combination);
//        } else {
//            char digit = digits.charAt(0);
//            String letters = mapping.get(digit);
//            for (int i = 0; i < letters.length(); i++) {
//                char letter = letters.charAt(i);
//                backtrack(combination + letter, digits.substring(1), mapping, result);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String digits = sc.nextLine();
//        sc.close();
//
//        List<String> combinations = letterCombinations(digits);
//        for(String combination : combinations){
//            System.out.print(combination+" ");
//        }
//    }
//}

public class mobileNumString{
    static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tvu","wxyz"};
    static void possibleWords(String s, String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        String key = keypad[s.charAt(0)-'0'];
        for(int i=0; i<key.length();i++){
            possibleWords(s.substring(1), ans+key.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String number = sc.nextLine();
        possibleWords(number,"");
    }
}
