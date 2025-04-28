import java.util.Scanner;
public class stringDifferentCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int upperCase=0,lowerCase=0,digits=0,specialCharacters = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' )
                upperCase++;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z' )
                lowerCase++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                digits++;
            else
                specialCharacters++;
        }
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(specialCharacters);
        System.out.println(digits);
    }
}
