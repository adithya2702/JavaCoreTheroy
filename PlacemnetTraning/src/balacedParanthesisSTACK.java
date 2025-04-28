import java.util.Scanner;
import java.util.Stack;
public class balacedParanthesisSTACK {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String a = sc.next();
        int c= 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==')' && st.peek() == '(' ) {
                st.pop();
            }
            else{
                st.push(a.charAt(i));
                c++;
            }
        }
        System.out.println(c);
    }
}
