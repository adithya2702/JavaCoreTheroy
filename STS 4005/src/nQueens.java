import java.util.Scanner;

// BAck tracking

//8*8 n queens problem -- 92 solutions
//4*4 n queens problem -- 2 solutions

public class nQueens {
    private int[] queens;
    private int N;

    public nQueens(int n) {
        N = n;
        queens = new int[N];
    }

    public boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(i - row) == Math.abs(queens[i] - col)) {
                return false;
            }
        }
        return true;
    }

    public void solveNQueens(int row) {
        if (row == N) {
            printQueens();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                queens[row] = col;
                solveNQueens(row + 1);
            }
        }
    }

    public void printQueens() {
        System.out.println("Solution:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the chessboard (N): ");
        int N = scanner.nextInt();

        nQueens nQueens = new nQueens(N);
        nQueens.solveNQueens(0);

        scanner.close();
    }
}
