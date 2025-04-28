package Arrays;
import java.util.Scanner;

public class setMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        setZeroes(a);
    }
    public static void setZeroes(int[][] a) {
        int[][] a2 = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a2[i][j]=a[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0) {
                    for (int k = 0; k < a2.length; k++) {
                        a2[i][k] = 0;
                    }
                    for (int k = 0; k < a2[0].length; k++) {
                        a2[k][i] = 0;
                    }
                }
            }
        }
        for (int[] ints : a2) {
            for (int j = 0; j < a2[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
