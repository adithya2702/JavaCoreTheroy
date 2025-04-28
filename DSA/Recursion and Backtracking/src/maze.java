import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean [][] a = new boolean[m][n];
        int [][] b = new int[m][n];
//        System.out.println(mazeCountRightLeft(m,n,0,0));
//        System.out.println(pathRightLeft("",m,n,0,0));
//        System.out.println(pathRightLeftDiagonal("",m,n,0,0));
        //System.out.println(allDirections("",m,n,0,0,a));
        printPath("",m,n,0,0,a,b,1);
    }
    static int mazeCountRightLeft(int m,int n,int i,int j){
        if(i==m-1&& j==n-1)
            return 1;
        if(i>=m || j>=n) return 0;
        else{
            return mazeCountRightLeft(m,n,i+1,j)+mazeCountRightLeft(m,n,i,j+1);
        }
    }
    static List<String> pathRightLeft(String s,int m,int n,int i,int j){
        if(i==m-1 && j==n-1){
            List<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        if (i >= m || j >= n) return new ArrayList<>();

        List<String> paths = new ArrayList<>();
        paths.addAll(pathRightLeft(s + "D", m, n, i + 1, j)); // Move Down
        paths.addAll(pathRightLeft(s + "R", m, n, i, j + 1)); // Move Right
        return paths;
    }
    static List<String> pathRightLeftDiagonal(String p,int m,int n,int i,int j){
        if(i==m-1 &&j==n-1){
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(i>=m || j>=n) return new ArrayList<>();
        List<String> list =new ArrayList<>();
        list.addAll(pathRightLeftDiagonal(p+"D",m,n,i+1,j));
        list.addAll(pathRightLeftDiagonal(p+"R",m,n,i,j+1));
        list.addAll(pathRightLeftDiagonal(p+"d",m,n,i+1,j+1));
        return list;
    }
    static List<String> allDirections(String p,int m,int n,int i,int j ,boolean[][]vis){
        if(i==m-1 && j==n-1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(i>=m ||j>=n || i<0 || j<0 || vis[i][j]) return new ArrayList<>();

        List<String> l = new ArrayList<>();
        vis[i][j]=true;
        l.addAll(allDirections(p+"D",m,n,i+1,j,vis));
        l.addAll(allDirections(p+"R",m,n,i,j+1,vis));
        l.addAll(allDirections(p+"U",m,n,i-1,j,vis));
        l.addAll(allDirections(p+"L",m,n,i,j-1,vis));
        vis[i][j]=false;//update the changes made

        return l;
    }
    static void printPath(String p,int m,int n,int i,int j ,boolean[][]vis,int [][]a,int step){
        if(i==m-1 && j==n-1){
            a[i][j]=step;
            for(int[] arr:a){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(i>=m ||j>=n || i<0 || j<0 || vis[i][j]) return ;

        vis[i][j]=true;
        a[i][j]=step;
        printPath(p+"D",m,n,i+1,j,vis,a,step+1);
        printPath(p+"R",m,n,i,j+1,vis,a,step+1);
        printPath(p+"U",m,n,i-1,j,vis,a,step+1);
        printPath(p+"L",m,n,i,j-1,vis,a,step+1);
        vis[i][j]=false;//update the changes made
        a[i][j]=0;

    }
}