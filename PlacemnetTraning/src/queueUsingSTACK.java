import java.util.Scanner;
import java.util.Stack;
public class queueUsingSTACK {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static void enqueue(int ele){
        if(s1.isEmpty()){
            s1.push(ele);
        }
        else{
            while(!s1.isEmpty()){
                int x=s1.pop();
                s2.push(x);
            }
            s1.push(ele);
        }
        while(!s2.isEmpty()){
            int y = s2.pop();
            s1.push(y);
        }
    }
    static void dequeue(){
        if(s1.isEmpty()){
            return;
        }
        s1.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for(int i=0; i<n ; i++){
            int ele = sc.nextInt();
            enqueue(ele);
        }
        int s = sc.nextInt();
        for(int i=0;i<s;i++){
            dequeue();
        }
        while(!s1.isEmpty()){
            System.out.print(s1.peek() +" ");
            s1.pop();
        }
    }
}
