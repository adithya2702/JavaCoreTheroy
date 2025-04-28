public class PrintStatements {
    public static void main(String[] args) {
        //print
        System.out.print("Hello");
        System.out.print("World");
        //println
        System.out.println("Hello");
        System.out.println("World!");
        //printf
        System.out.printf("The year is %d and month is %s",2024,"June");

        //if we want to print in red colour like error
        System.err.print("There is no error");
        System.err.println("There is no error");
        System.err.printf("There is no %s","Money");
        System.out.format("The temperature is %.2f degrees Celsius.%n", 23.456);
    }
}
/*

%b      boolean
%c      char
%d      integer
%e      scientificNotation
%f      float
%s      string
%tc     complete date and time
%n      a newline
%%      the character %

*/
/*
    1) What is the role of System.out.format() in Java?
        Answer: System.out.format() is similar to System.out.printf().
    2) How can you redirect System.out to a file?
        Answer: You can redirect System.out to a file using System.setOut() method. This requires creating a PrintStream object that writes to a file.
//        try {
//            PrintStream ps = new PrintStream(new File("output.txt"));
//            System.setOut(ps);
//            System.out.println("This will be written to the file.");
//            ps.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    3)
 */