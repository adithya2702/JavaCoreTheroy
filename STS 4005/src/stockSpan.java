//Stock Span

import java.util.*;
public class stockSpan {
    static void span(int n, int[] P, int[] S){
        Stack<Integer> st = new Stack<>();
        S[0] = 1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && P[st.peek()] <= P[i]){
                st.pop();
            }
            S[i] = (st.isEmpty() ? (i+1) : (i - st.peek()));
            st.push(i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] P = new int[n];
        int[] S = new int[n];
        for(int i=0;i<n;i++){
            P[i] = sc.nextInt();
        }
        span(n,P,S);
        for(int i=0; i<n; i++){
            System.out.print(S[i] + " ");
        }
    }
}