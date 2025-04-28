import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class stackPermutations {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i= 0; i<n; i++){
            q1.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            q2.add(sc.nextInt());
        }
        Stack <Integer> st = new Stack<>();
        int j=0;
        while(!q1.isEmpty()){
            st.push(q1.poll());
            while (!st.isEmpty() && st.peek() == q2.peek()) {
                st.pop();
                q2.poll();
                j++;
            }
        }
        if(j==n && st.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}