public class Variables {//A variable in Java is a container that holds data
    int id= 100; //Instance Variables
    static String Name = "Adi"; // Class Variables
    public static void main(String[] args) {
        String firstName= "Padavala"; // Local variables
        System.out.println(Name);
     // System.out.println(id); // because it is nonstatic we should create object to call
        Variables var= new Variables();
        System.out.println(var.id);
    }
    public void method(int id2 /*Parameters: we cannot assign values here*/){
        id2=200;
        System.out.println(id2);
      // System.out.println(firstName); // we cant call local variables to other methods

        //Rules
        double MATH_PIE = 3.14; // universal constants must be capital
        String lastName = "Adithya"; // no shortcuts as LN
      //int class= 20;  //No  keywords for variables
        // we can use '_' '$' are two special characters in variables
    }
}
/*
    1) Can local variables have default values?
        Answer: No, local variables do not have default values and must be explicitly initialized before use.
    2) What is variable shadowing in Java?
        Answer: Variable shadowing occurs when a variable declared within a certain scope (like a method or block) has the same name as a variable declared in an outer scope. The inner variable "shadows" the outer variable.
//        class ShadowTest {
//            int x = 0;
//            class FirstLevel {
//                int x = 1;
//                void methodInFirstLevel(int x) {
//                    System.out.println("x = " + x); // Local variable
//                }
//            }
//        }
    3) What is variable hiding?
        Answer: Variable hiding happens when a subclass declares a variable with the same name as one in its superclass. The subclass variable hides the superclass variable.
//        class SuperClass {
//            int x = 10;
//        }
//        class SubClass extends SuperClass {
//            int x = 20;
//            void printX() {
//                System.out.println("x = " + x); // Subclass variable
//                System.out.println("super.x = " + super.x); // Superclass variable
//            }
//        }
       4) What is the difference between a variable and a field in Java?
            Answer: A variable is a general term for any data storage location. A field is a specific type of variable that is a member of a class or an instance.
       5) Explain the concept of a heap and stack memory in relation to variable storage.
            Answer: In Java, the stack memory is used for static memory allocation and the execution of a thread, where local variables are stored. The heap memory is used for dynamic memory allocation where objects and instance variables are stored.
 */

