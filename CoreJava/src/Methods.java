public class Methods {
    static int currentBalance = 1000;
    public static void deposit(int amount){
        currentBalance = currentBalance+amount;
        System.out.println(currentBalance);
    }
    public  void withdraw(int amount){
        currentBalance = currentBalance- amount;
        System.out.println(currentBalance);
    }
    public int getBalance(){
        return currentBalance;
    }
    public static void main(String[] args) {
        System.out.println(currentBalance);
        deposit(200);
        //withdraw is not static so create object
        Methods m= new Methods();
        m.withdraw(500);
        m.getBalance();
    }
}
/*
    1) What is a method in Java?
        Answer: A method in Java is a block of code that performs a specific task. It is used to execute code, perform operations, and return a result.
    2) What is method overloading?
        Answer: Method overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).
//        public class Example {
//            public void print(int a) {
//                System.out.println(a);
//            }
//            public void print(String s) {
//                System.out.println(s);
//            }
//        }
    3) What is method overriding?
        Answer: Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as in the superclass.
//        class Parent {
//            public void display() {
//                System.out.println("Parent");
//            }
//        }
//        class Child extends Parent {
//            @Override
//            public void display() {
//                System.out.println("Child");
//            }
//        }
    4) Can a static method be overridden?
        Answer: No, static methods cannot be overridden. They can be hidden if a subclass defines a static method with the same name.
    5) What is a method reference in Java 8 and above?
        Answer: A method reference is a shorthand notation of a lambda expression to call a method. It uses the :: operator.
//        List<String> list = Arrays.asList("a", "b", "c");
//        list.forEach(System.out::println);
    6) What is the `this` keyword in methods?
        Answer: The this keyword refers to the current instance of the class. It is often used to access instance variables and methods from within the method.
    7) What is the `super` keyword in methods?
        Answer: The super keyword refers to the superclass of the current object. It can be used to call superclass methods or access superclass variables.
 */