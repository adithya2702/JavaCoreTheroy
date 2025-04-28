package OOPS.Inhertance;

//use "extends" keyword to use parent methods and variables
public class developer extends admin {
    public static void write(){
        System.out.println("hello");
    }

    //super keyword is used to get method from parent class like super.read()
    public static void read(){
        System.out.println("child hii");
    }
}
