import java.util.Scanner;
public class mooshakMouse {
    static int flag = 0;
    public static void slove(int n,int a[][],int i,int j){
        if(i>=0 && i<n && j>=0 && j<n && a[i][j]==9){
            flag = 1;
        }
        if(i==-1||j==-1||i==n||j==n||a[i][j]==0||a[i][j]==2){
            return;
        }
        else{
            a[i][j] =2;
            slove(n,a,i-1,j);
            slove(n,a,i,j-1);
            slove(n,a,i+1,j);
            slove(n,a,i,j+1);
            a[i][j]= 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        slove(n,a,0,0);
        if(flag == 1)
            System.out.println("1");
        else System.out.println("0");
    }
}
