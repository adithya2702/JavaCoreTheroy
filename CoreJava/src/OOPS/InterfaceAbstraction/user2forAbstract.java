package OOPS.InterfaceAbstraction;

public class user2forAbstract {
    public static void main(String[] args) {
        laptop user2 = new apple();
        user2.copy();//here using interface we hide the function of copy method in apple
        studentAbstract user3 = new apple();
        user3.copy();
    }
}
