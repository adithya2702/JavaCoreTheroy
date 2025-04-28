import java.util.Scanner;
public class mazeSolving {
    private static int[][] maze;
    private static int N;
    public mazeSolving(int n) {
        N = n;
        maze = new int[N][N];
    }
    public static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == N - 1 && y == N - 1) {
            solution[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;

            if (solveMaze(maze, x + 1, y, solution))
                return true;

            if (solveMaze(maze, x, y + 1, solution))
                return true;

            solution[x][y] = 0; // backtrack
            return false;
        }

        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the maze: ");
        int size = scanner.nextInt();

        mazeSolving mazeSolver = new mazeSolving(size);

        System.out.println("Enter the maze (1 for path, 0 for dead end):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        int[][] solution = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                solution[i][j] = 0;
            }
        }

        if (solveMaze(maze, 0, 0, solution)) {
            System.out.println("Solution exists!");
            System.out.println("Path to solve the maze:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }

        scanner.close();
    }
}
