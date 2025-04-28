package ExceptionHandling;

public class createNewException extends Exception{
    public static void main(String[] args) throws createNewException {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            throw new createNewException("Login failed check the credentials");//Depends on user we can create new Exceptions this way like login exception,payment exception
        }
    }
    public createNewException(String s){
        super(s);
    }
}
//
/*  POJO-Plain Old Java Object
    It is a simple object class.,which is not bound by any restrictions.
    Rules:
        It must be public(compulsory)
        It recommend to take the properties(instance variables) as private to improve security.
        It can have getters and setters in order to access the properties.
        It shouldn
        It shouldn't
*/