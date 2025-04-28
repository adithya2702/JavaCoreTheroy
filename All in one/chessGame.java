import java.util.Scanner;

public class chessGame {
    private static final int BOARD_SIZE = 8;
    private static final char EMPTY = '.';
    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter move (e.g., a2a4): ");
            String move = scanner.nextLine().toLowerCase();

            if (move.equals("exit")) {
                break;
            }

            if (isValidMove(move)) {
                makeMove(move);
                printBoard();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    private static void initializeBoard() {
        // Initialize the board with pieces in their starting positions
        char[] initialPieces = {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (i == 1 || i == 6) {
                    board[i][j] = 'P'; // Pawn
                } else if ((i == 0 || i == 7)) {
                    board[i][j] = initialPieces[j]; // Other pieces
                } else {
                    board[i][j] = EMPTY; // Empty space
                }
            }
        }
    }


    private static void printBoard() {
        // Print the current state of the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(String move) {
        // Validate the move format (e.g., a2a4)
        if (move.length() != 4) {
            return false;
        }

        // Validate the positions (e.g., a-h for columns, 1-8 for rows)
        char[] positions = move.toCharArray();
        if (positions[0] < 'a' || positions[0] > 'h' ||
                positions[2] < 'a' || positions[2] > 'h' ||
                positions[1] < '1' || positions[1] > '8' ||
                positions[3] < '1' || positions[3] > '8') {
            return false;
        }

        // TODO: Add more validation for legal chess moves

        return true;
    }

    private static void makeMove(String move) {
        // Update the board with the new move
        char[] positions = move.toCharArray();
        int startRow = 8 - (positions[1] - '0');
        int startCol = positions[0] - 'a';
        int endRow = 8 - (positions[3] - '0');
        int endCol = positions[2] - 'a';

        char piece = board[startRow][startCol];
        board[startRow][startCol] = EMPTY;
        board[endRow][endCol] = piece;
    }
}
