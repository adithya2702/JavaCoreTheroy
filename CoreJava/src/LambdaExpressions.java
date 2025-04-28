//Lambda expression means it's a way of reducing the code. We create anonymous function(function is same as method in addition we can send it as a parameter to other function) using this.
//These are used only for implementation of "functional interfaces".
public class LambdaExpressions {
    public static void main(String[] args) {
        Audi c1 = new Audi();//This is created using traditional way
        c1.drive();
        Car c2 = new Car() {  //This is anonymous class creation
            @Override
            public void drive() {
                System.out.println("Driving BMW");
            }
        };
        c2.drive();
        // Lambda Expression with anonymous function(means it have only one method in)
        // It has 3 components: (arguments) -> {function body};
        Car c3 = () ->/* -> this is arrow token way to represent that we are using lambda expression*/ {//If we have a parameter in the abstract method then we don't need to specify the data type in these brackets just a variable name is required;
            int s = 50;//We can perform any operation like in method
            System.out.println("Driving Tata");
            System.out.println("Speed is " + s);
            //return data;// If the method returns any datatype then just add this and if we want only one line return then no need to specify return keyword just the value is enough.
        };
        c3.drive();
    }
}
@FunctionalInterface
interface Car {
    public void drive();
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Audi");
    }
}
