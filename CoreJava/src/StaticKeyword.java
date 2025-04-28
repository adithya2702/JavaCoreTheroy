/*
Java file after compile to class file. If we run it class loader directs to JVM memory
In JVM memory we have Method area and Head memory
Method area creates a class block where we have static variables and static methods and static blocks
Heap  memory creates separate for each object created in class which are non-static
 */
import java.util.Random;
public class StaticKeyword {
    //int number; //Here it is non-static it gives different values
    static int number;
    public static void main(String[] args) {
        StaticKeyword n1 = new StaticKeyword();
        n1.number = new Random().nextInt();

        StaticKeyword n2 = new StaticKeyword();
        n2.number = new Random().nextInt();

        StaticKeyword n3 = new StaticKeyword();
        n3.number = new Random().nextInt();
        //Separate blocks are created for each object in heap memory when it is non-static
        // If it is static we have only one class crated block static variable have only one number which shares memory
        System.out.println(n1.number);
        System.out.println(n2.number);
        System.out.println(n3.number);

        //No need to create an object for static variable u can directly access it or by class name u can access
        System.out.println(StaticKeyword.number);
        System.out.println(number);
    }
}
