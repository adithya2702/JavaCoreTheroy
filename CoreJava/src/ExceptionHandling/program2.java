package ExceptionHandling;

import java.io.*;

public class program2 {
    public static void main(String[] args) throws Throwable/*Instead of using all exceptions here what we get in class we can use Throwable as it is super class of exception and also we can use Exception it is sub class os Throwable*/ {
        File f= new File("./sample.txt");
        //Instead of using close for AutoClosable classes we can put them in try resource(we call it resource not parameters here)
        //this is try with resource concept
        try(FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);){
            String text="";
            String line;
            while((line = br.readLine())!=null) {
                text += line + "\n";
            }
            System.out.println(text);

            //let us take example for exception
            int a[]={1,2};
            System.out.println(a[3]);
        }
        catch(FileNotFoundException fne){
            fne.printStackTrace();
        }
        //we can use multiple catch blocks for different exceptions in try block
        catch(ArithmeticException | ArrayIndexOutOfBoundsException aie){    //we can include one type of exceptions u need in one catch block
            aie.printStackTrace();
            System.out.println("Please don't divide number by zero");
            System.out.println("Please use index with in the range of array");
        }
    }
}