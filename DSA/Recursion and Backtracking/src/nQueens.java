import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        boolean [][] a = new boolean[n][n];
        char[][] c =new char[n][n];
        System.out.println(sol(a,0));
    }
    static int sol(boolean[][] board,int row){
        //to print the board
        if(row==board.length){
            for(boolean[] bol: board){
                for(boolean val:bol){
                    if(val) {
                        System.out.print('Q'+" ");
                    }
                    else{
                        System.out.print('X'+" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return 1;
        }
        int count =0;
        //placing queen and checking for every row and col
        for(int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=sol(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]) return false;
        }
        int rightDiagonal = Math.min(row, board.length-col-1);
        for(int i=1;i<=rightDiagonal;i++){
            if(board[row-i][col+i]) return false;
        }
        int leftDiagonal = Math.min(row,col);
        for(int i=1;i<=leftDiagonal;i++){
            if(board[row-i][col-i]) return false;
        }
        return true;
    }
}
