import java.util.Scanner;
import java.util.ArrayList;
public class adjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Integer> [] al = new ArrayList[v];
        for(int i=0; i<v; i++){
            al[i] = new ArrayList<>();
        }
        for(int i=0; i<e; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            al[s].add(d);
            al[d].add(s);
        }
        for(int i=0;i<v; i++){
            for(int j=0; j<al[i].size();j++){
                System.out.print(al[i].get(j)+" ");
            }
            System.out.println();
        }
    }
}
