package OOPS.InterfaceAbstraction;

public class userOfCar {
    public static void main(String[] args) {
        carFunctionalInterface c = new carFunctionalInterface()/*This is called anonumus class creation used to create object to interface by which we can change n number of car companies without creating each class to it which saves memory*/ {
            @Override
            public void drive() {
                System.out.println("Drive audi car");//we can use this for any car company
            }
        };
        c.drive();
    }
}
