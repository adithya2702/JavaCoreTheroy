import java.util.Scanner;

//Wardorff's algorithm is a heuristic approach for solving the Knight's Tour problem,
// which involves finding a sequence of moves of a knight on a chessboard such that
// the knight visits every square exactly once.

//It follows  Backtracking Algorithm
public class warnsdorffsAlgorithm {
    private int[][] board;
    private int boardSize;
    private int[][] moves = { { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 }, { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 } };

    public warnsdorffsAlgorithm(int size) {
        boardSize = size;
        board = new int[boardSize][boardSize];
    }

    public boolean isSafe(int x, int y) {
        return (x >= 0 && x < boardSize && y >= 0 && y < boardSize && board[x][y] == 0);
    }

    public boolean solveTour() {
        board[0][0] = 1; // starting position

        if (solveTourUtil(0, 0, 2))
            return true;
        else {
            System.out.println("No solution exists.");
            return false;
        }
    }

    public boolean solveTourUtil(int x, int y, int moveNum) {
        if (moveNum == boardSize * boardSize + 1)
            return true;

        for (int i = 0; i < moves.length; i++) {
            int nextX = x + moves[i][0];
            int nextY = y + moves[i][1];

            if (isSafe(nextX, nextY)) {
                board[nextX][nextY] = moveNum;
                if (solveTourUtil(nextX, nextY, moveNum + 1))
                    return true;
                else
                    board[nextX][nextY] = 0; // backtrack
            }
        }

        return false;
    }

    public void printTour() {
        System.out.println("Knight's Tour:");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the chessboard: ");
        int size = scanner.nextInt();

        warnsdorffsAlgorithm knightsTour = new warnsdorffsAlgorithm(size);
        if (knightsTour.solveTour()) {
            knightsTour.printTour();
        }

        scanner.close();
    }
}
