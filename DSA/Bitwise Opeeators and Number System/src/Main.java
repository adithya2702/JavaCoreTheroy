// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "abcdabab";

        for(int i=0;i<s.length()&&s.indexOf("ab",i)!=-1 ;){
            System.out.println(s.indexOf("ab",i));
            i=s.indexOf("ab",i);
            i++;
        }
    }
}