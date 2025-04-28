import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mazeRiver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println(path("",a,0,0));
    }
    static List<String> path(String p,int[][]a,int i,int j){
        if(i==a.length-1 && j==a[0].length-1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> l = new ArrayList<>();
        if(i>=a.length || j>=a[0].length || a[i][j] == 0) return new ArrayList<>();
        if(i<a.length-1 && a[i+1][j]!=0)  l.addAll(path(p+"D",a,i+1,j));
        if(j<a[0].length-1 && a[i][j+1]!=0) l.addAll(path(p+"R",a,i,j+1));
        return l;
    }
}
