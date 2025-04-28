import java.util.Scanner;
import java.util.Stack;
public class stockSpanUsingStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of prizes: ");
        int n = sc.nextInt();
        int [] p= new int[n];
        int []s=new int[n];
        System.out.println("Enter the prizes of all "+n+" items: ");
        for(int i=0; i<n; i++){
            p[i]= sc.nextInt();
        }
        span(n,p,s);
        for(int i=0; i<n; i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void span(int n,int p[],int s[]){
        Stack<Integer> st =new Stack<>();
        s[0] = 1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && p[st.peek()]<=p[i]){
                st.pop();
            }
            s[i] = (st.isEmpty()?(i+1):(i-st.peek()));
            st.push(i);
        }
    }
}