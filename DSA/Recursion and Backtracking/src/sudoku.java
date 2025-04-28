import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = {{"5", "3", "", "", "7", "", "", "", ""},
        {"6", "", "", "1", "9", "5", "", "", ""},
        {"", "9", "8", "", "", "", "", "6", ""},
        {"8", "", "", "", "6", "", "", "", "3"},
        {"4", "", "", "8", "", "3", "", "", "1"},
        {"7", "", "", "", "2", "", "", "", "6"},
        {"", "6", "", "", "", "", "2", "8", ""},
        {"", "", "", "4", "1", "9", "", "", "5"},
        {"", "", "", "", "8", "", "", "7", "9"}};
        solve(arr,0,0);
    }
    static void solve(String[][] board,int row,int col){
        if(row== board.length){
            print(board);
            return;
        }
        if(col== board.length){
            solve(board,row+1,0);
            return;
        }
        if (!board[row][col].isEmpty()) {
            solve(board, row, col + 1);
            return;
        }
        for(int val=1;val<10;val++) {
            if (isSafe(board, row, col,val)){
                board[row][col]=Integer.toString(val);
                solve(board,row,col+1);
                board[row][col]="";
            }
        }
    }
    static boolean isSafe(String[][] board, int row,int col,int value){
        for(int i=0;i<board.length;i++){
            if(board[row][i].equals(Integer.toString(value)) || board[i][col].equals(Integer.toString(value))) return false;
        }
        //safe in side each 3x3 matrix
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j].equals(Integer.toString(value))) {
                    return false;
                }
            }
        }
        return true;
    }
    static void print(String[][] board){
        for (String[] row : board) {
            for (String val : row) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
