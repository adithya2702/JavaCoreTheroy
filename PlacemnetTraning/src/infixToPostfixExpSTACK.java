import java.util.Stack;
import java.util.Scanner;
public class infixToPostfixExpSTACK {
    static int precedence(Character ch){
        switch(ch){
            case '^' : return 3;
            case '*' : case '/': return 2;
            case '+' : case '-': return 1;
        }
        return -1;
    }
    static void infToPost(String a){
        String postfix = "";
        Stack<Character> st = new Stack<>();
        for(int i=0; i<a.length(); i++) {
            Character ch = a.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                postfix += ch;
            }
            else if (ch== '('){
                st.push(ch);
            }
            else if(ch== ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    postfix += st.pop();
                }
                st.pop();
            }
            else if(precedence(ch)>0){
                if(st.isEmpty() || st.peek()=='('){
                    st.push(ch);
                }
                else {
                    while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                        postfix += st.pop();
                    }
                    st.push(ch);
                }
            }
        }
        while(!st.isEmpty()) {
            postfix += st.pop();
        }
        System.out.println(postfix);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String s = sc.next();
        infToPost(s);
    }
}