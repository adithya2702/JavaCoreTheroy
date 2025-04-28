package OOPS.Encapsulation;
//here we are giving through methods not directly to just hide data not implementation.
//until java8 abstraction is 100% because we cannot implement in interface after that it depends on designer who makes interface
//if we implement methods in abstract class then abstract nature reduces same for interface.
public class teacher {
    public static void main(String[] args) {
        student s= new student(100);
        s.setAttend(true);
        s.getAttend();
    }
}