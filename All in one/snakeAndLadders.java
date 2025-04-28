import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class snakeAndLadders {
    private static final int BOARD_SIZE = 100;
    private static final Map<Integer, Integer> snakes;
    private static final Map<Integer, Integer> ladders;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        snakes = new HashMap<>();
        snakes.put(16, 6);
        snakes.put(47, 26);
        snakes.put(49, 11);
        snakes.put(56, 53);
        snakes.put(62, 19);
        snakes.put(64, 60);
        snakes.put(87, 24);
        snakes.put(93, 73);
        snakes.put(95, 75);
        snakes.put(98, 78);

        ladders = new HashMap<>();
        ladders.put(1, 38);
        ladders.put(4, 14);
        ladders.put(9, 31);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(80, 100);
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    private static int getNextPosition(int currentPosition, int diceValue) {
        int nextPosition = currentPosition + diceValue;
        if (nextPosition > BOARD_SIZE) {
            return currentPosition;
        }
        if (snakes.containsKey(nextPosition)) {
            return snakes.get(nextPosition);
        }
        if (ladders.containsKey(nextPosition)) {
            return ladders.get(nextPosition);
        }
        return nextPosition;
    }

    public static void main(String[] args) {
        int playerPosition = 0;
        int computerPosition = 0;

        System.out.println("Welcome to Snake and Ladders!");

        while (true) {
            System.out.println("\nPlayer's turn (Press Enter to roll the dice)");
            scanner.nextLine();
            int diceValue = rollDice();
            System.out.println("You rolled a " + diceValue);
            playerPosition = getNextPosition(playerPosition, diceValue);
            System.out.println("Your position: " + playerPosition);
            if (playerPosition == BOARD_SIZE) {
                System.out.println("Congratulations! You won!");
                break;
            }

            System.out.println("\nComputer's turn");
            diceValue = rollDice();
            System.out.println("Computer rolled a " + diceValue);
            computerPosition = getNextPosition(computerPosition, diceValue);
            System.out.println("Computer's position: " + computerPosition);
            if (computerPosition == BOARD_SIZE) {
                System.out.println("Computer won!");
                break;
            }
        }

        scanner.close();
    }
}
