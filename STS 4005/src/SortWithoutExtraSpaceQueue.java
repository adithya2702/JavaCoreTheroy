import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class SortWithoutExtraSpaceQueue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
            q.add(sc.nextInt());
        sort(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.poll();
        }
    }
    static void sort(Queue<Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            int min_index = min(q, q.size() - i);
            insertatend(q, min_index);
        }
    }
    static int min(Queue<Integer> q,int index){
        System.out.println(q);
        int minval = Integer.MAX_VALUE;
        int min_index =-1;
        int n= q.size();
        for(int i=0; i<n; i++){
            int cur = q.poll();
            if(cur<=minval && i<index){
                minval = cur;
                min_index = i;
            }
            q.add(cur);
        }
        return min_index;
    }
    static void insertatend(Queue<Integer> q, int min_index)
    {
        int minval = 0;
        int s= q.size();
        for(int i=0;i<s; i++){
            int curr = q.poll();
            if(i != min_index)
                q.add(curr);
            else
                minval = curr;
        }
        q.add(minval);
    }
}
