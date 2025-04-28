import java.util.Scanner;
public class stringsCountMaxCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int count =0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == c)
                count++;
        }
        System.out.println(count);
    }
}
