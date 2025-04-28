import java.util.Scanner;
import java.util.Stack;
public class celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of persons: ");
        int n= sc.nextInt();
        int [][] arr=new int [n][n];
        System.out.println("Enter the array values: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        cele(arr);
    }
    public static void cele(int arr[][]){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()>=2){
            int c= st.pop();
            int d= st.pop();
            if(arr[c][d]==1)
                st.push(d);
            else
                st.push(c);
        }
        int pc = st.pop();
        for(int i=0;i<n;i++){
            if(i!=pc){
                if(arr[i][pc]==0 || arr[pc][i]==1){
                    System.out.println("No celebrity found");
                    return;
                }
            }
        }
        System.out.println("Person "+(pc+1)+" is celebrity");
    }
}