import java.util.Stack;
import java.util.Scanner;
public class postfixEvalSTACK {
    static int postfixCal(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c))
                stack.push(c - '0'); // converts char to integer
            else {
                if (!stack.isEmpty()){
                    int x = stack.pop();
                    int y = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(x + y);
                            break;
                        case '-':
                            stack.push(x - y);
                            break;
                        case '/':
                            stack.push(x / y);
                            break;
                        case '*':
                            stack.push(x * y);
                            break;
                    }
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < n; i++) {
            String exp = sc.next();
            a[i] =  postfixCal(exp);
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}