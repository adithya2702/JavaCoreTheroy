import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            try {
                if (s.length() != 5 || t.length() != 5) {
                    throw new IllegalArgumentException("Word length should be 5");
                }
                if (!s.matches("[A-Z]{5}") || !t.matches("[A-Z]{5}")) {
                    throw new IllegalArgumentException("String format exception: Only uppercase letters allowed");
                }
                System.out.println(find(s, t));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
    public static String find(String s,String t){
        StringBuilder m=new StringBuilder();
        for(int i=0;i<5;i++){
            if(s.charAt(i)==t.charAt(i)) m.append("G");
            else m.append("B");
        }
        return m.toString();
    }
}
