package ExceptionHandling;

import java.util.Arrays;

//Checked exceptions(compilation time)
//Unchecked exception(runtime)
//Exception handling is user handling using try catch blocks, finally,throw,throws keyword
public class program1 {
    public static void main(String[] args) {
        System.out.println("program started");
        int res=0;
        //res=9/0;
        /*
        Exception name      :   java.lang.ArithmeticException:
        Exception message   :   / by zero
        Which line number   :   program1.java:8
        Methods information
        Check error in reverse order
         */
        //try catch is only used when the exception occurs
        try{
            res = 9/0;
        }

        catch(ArithmeticException ae){//this will not-executed if there is no exception
            System.out.println(ae.toString());//write a logic to enter this message into log files
            System.out.println(ae.getMessage());//print exception message
            System.out.println(Arrays.toString(ae.getStackTrace()));//print the exception in methods
            ae.getStackTrace();//print the full exception
            //throw ae;//if the exception usage is over then throw back it to java using throw keyword

        }

        //if exception occurs or not occurs finally block will be executed
        finally{
            System.out.println("finally block");
        }//finally block only will be executed if the exception also come before the exception

        System.out.println("result is: "+res);
        System.out.println("Program ended");
    }
}
//try block should be complete with catch or finally
//catch block alone can't be written it should contain before try block
//finally block alone can't be written it should contain before try block
//In java both file and directory(folder) are treated same