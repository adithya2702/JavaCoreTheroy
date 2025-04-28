import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int theScore(int input1, int[] input2, int[] input3) {
        // Create an array to store maximum marks for each question (assuming question numbers are 1-10)
        int[] maxMarks = new int[11];  // Using 11 as index 0 won't be used

        // Iterate through all attempts
        for (int i = 0; i < input1; i++) {
            int questionNum = input2[i];
            int marks = input3[i];

            // Update maximum marks for this question if current marks are higher
            if (marks > maxMarks[questionNum]) {
                maxMarks[questionNum] = marks;
            }
        }

        // Calculate total by summing maximum marks for all questions
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += maxMarks[i];
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main calculator = new Main();

        // Get number of attempts
        System.out.print("Enter the number of attempts (N): ");
        int input1 = scanner.nextInt();

        // Validate input1
        if (input1 <= 0) {
            System.out.println("Number of attempts must be positive!");
            scanner.close();
            return;
        }

        // Initialize arrays
        int[] input2 = new int[input1];  // Question numbers
        int[] input3 = new int[input1];  // Marks

        // Get question numbers and marks
        for (int i = 0; i < input1; i++) {
            System.out.println("\nAttempt " + (i + 1) + ":");

            // Get question number
            System.out.print("Enter question number (1-10): ");
            int question = scanner.nextInt();
            if (question < 1 || question > 10) {
                System.out.println("Question number must be between 1 and 10!");
                scanner.close();
                return;
            }
            input2[i] = question;

            // Get marks
            System.out.print("Enter marks obtained (0-100): ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100!");
                scanner.close();
                return;
            }
            input3[i] = marks;
        }

        // Calculate and display result
        int result = calculator.theScore(input1, input2, input3);
        System.out.println("\nResults:");
        System.out.println("Number of attempts: " + input1);
        System.out.println("Questions attempted: " + Arrays.toString(input2));
        System.out.println("Marks obtained: " + Arrays.toString(input3));
        System.out.println("Total Score: " + result);

        scanner.close();
    }
}