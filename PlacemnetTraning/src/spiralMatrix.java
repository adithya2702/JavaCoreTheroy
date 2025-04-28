import java.util.Scanner;
public class spiralMatrix {
    static void spiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if(matrix[top][i]==0){
                    System.out.print(matrix[top][i]);
                    return;
                }
                else {
                    System.out.print(matrix[top][i] + " ");
                }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                if(matrix[i][right]==0){
                    System.out.print(matrix[i][right]);
                    return;
                }
                else {
                    System.out.print(matrix[i][right] + " ");
                }
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if(matrix[bottom][i]==0){
                        System.out.print(matrix[bottom][i]);
                        return;
                    }
                    else {
                        System.out.print(matrix[bottom][i] + " ");
                    }
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if(matrix[i][left]==0){
                        System.out.print(matrix[i][left]);
                        return;
                    }
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            for(int i=0; i<m;i++){
                for(int j=0; j<n; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            spiral(a);
        }
    }