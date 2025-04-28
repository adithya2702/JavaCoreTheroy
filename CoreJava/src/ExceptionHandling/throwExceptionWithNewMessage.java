package ExceptionHandling;

public class throwExceptionWithNewMessage {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Waste fellow don't divide any number by zero");
        }
    }
}
