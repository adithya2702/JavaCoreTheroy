package OOPS.InterfaceAbstraction;

public class user {
    public static void main(String[] args) {
        hp user1 = new hp();
        user1.copy();
        user1.msofficeAccount();
        apple user2 = new apple();
        user2.paste();
        user2.security();//this results the code inside apple security
        laptop.video();//due to video is static we can access directly ans
    }
}
