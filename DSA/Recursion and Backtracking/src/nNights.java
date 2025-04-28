import java.util.Scanner;

public class nNights {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        boolean [][] board = new boolean[n][n];
        System.out.println(nights(board,0,0,n));
    }
    static int nights(boolean[][] board,int row,int col,int knights){
        if(knights==0){
            display(board);
            return 1;
        }
        int count=0;


        // Move to the next row if the current column exceeds the board length
        if(col==board.length) {
            nights(board, row + 1, 0, knights);
            return count;
        }
        // Stop if we have exhausted the board rows
        if (row == board.length) {
            return 0;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            count+=nights(board,row,col+1,knights-1);
            board[row][col] = false;
        }
        // Skip the current cell and move to the next column
        count+=nights(board,row,col+1,knights);
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col){
        if(row>=0 && row< board.length && col>=0 && col< board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean [] rows:board){
            for(boolean flag:rows){
                if(flag) {
                    System.out.print("K"+" ");
                }
                else{
                    System.out.print("-"+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
