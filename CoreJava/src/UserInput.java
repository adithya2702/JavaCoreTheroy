import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name= sc.nextLine();
        System.out.printf("Hello %s, How are you? \n",name);
        String status = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println(name +" is "+age+" years old.");
        sc.close();
    }
}
/*
    1) How do you handle exceptions when reading user input?
        Answer: You can use a try-catch block to handle exceptions like InputMismatchException
//        try {
//           Scanner sc = new Scanner(System.in);
//           int num = sc.nextInt();
//           System.out.println("You entered: " + num);
//           } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter an integer.");
//        }
    2) How do you read multiple lines of input until a specific keyword is entered?
        Answer: You can use a loop to read input until a certain keyword (like "exit") is entered.
//        Scanner sc = new Scanner(System.in);
//        String line;
//        while (!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
//            System.out.println("You entered: " + line);
//        }
 */