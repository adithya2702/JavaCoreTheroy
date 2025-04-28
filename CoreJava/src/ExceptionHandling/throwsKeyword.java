package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;

public class throwsKeyword {
    public static void main(String[] args) throws FileNotFoundException, IOError{
        File file =new File("D.:resume.pdf");
        FileInputStream fis = new FileInputStream(file);//we can solve this exception with try catch or use throws keyword to throw it java
    }
}
/*
Hierarchy of exceptions in java:
    Object
        Throwable(superclass os all the exceptions in java)
            Exception
                Runtime Exception(check exceptions)
                    IndexOutOfBoundsException
                    NullPointerException
                    ArithmeticException
                IO Exception
                    FileNotFoundException
                SQlException

Exceptions which are nor under runtime are unchecked exceptions(compile time exceptions)
 */