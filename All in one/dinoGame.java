import java.util.Scanner;

public class dinoGame {
    private static final int GROUND_HEIGHT = 10;
    private static final int JUMP_HEIGHT = 5;
    private static final int OBSTACLE_GAP = 10;
    private static final int OBSTACLE_WIDTH = 2;
    private static final int SCREEN_WIDTH = 40;

    private static int dinoHeight = 5;
    private static int dinoVelocity = 0;
    private static boolean isJumping = false;
    private static int obstaclePosition = SCREEN_WIDTH;
    private static boolean isGameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!isGameOver) {
            clearScreen();
            updateGame();
            drawGame();

            if (scanner.hasNext() && scanner.next().equalsIgnoreCase(" ")) {
                jump();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Game Over!");
        scanner.close();
    }

    private static void updateGame() {
        if (isJumping) {
            dinoVelocity -= 1;
            dinoHeight += dinoVelocity;

            if (dinoHeight <= GROUND_HEIGHT) {
                dinoHeight = GROUND_HEIGHT;
                dinoVelocity = 0;
                isJumping = false;
            }
        }

        obstaclePosition--;

        if (obstaclePosition < -OBSTACLE_WIDTH) {
            obstaclePosition = SCREEN_WIDTH;
        }

        if (obstaclePosition <= SCREEN_WIDTH / 2 && dinoHeight < GROUND_HEIGHT + JUMP_HEIGHT) {
            isGameOver = true;
        }
    }

    private static void drawGame() {
        for (int i = 0; i < GROUND_HEIGHT; i++) {
            System.out.println();
        }

        for (int i = 0; i < dinoHeight; i++) {
            System.out.print(" ");
        }
        System.out.println("O");

        for (int i = 0; i < SCREEN_WIDTH - obstaclePosition; i++) {
            System.out.print(" ");
        }
        System.out.println("X");

        for (int i = 0; i < OBSTACLE_GAP; i++) {
            System.out.println();
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void jump() {
        if (!isJumping) {
            dinoVelocity = JUMP_HEIGHT;
            isJumping = true;
        }
    }
}
