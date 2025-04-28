package OOPS.Polymorphism;
/*polymorphism is the ability of an object take on many forms.
    1.Compile time polymorphism or static polymorphism or arly binding
    2.Runtime polymorphism or dynamic polymorphism
Compile time polymorphism can be achieved by method overloading concept in java.
Runtime polymorphism can be achieved by method overriding concept in java.
 */

public class calculator {
   public void add(int a,int b){

   }
   // OVERLOADING: duplicate method name error if wee add parameters differently(no of parameters or data type of parameters or different order in datatype different) then error is handled this is called method overloading.
   //OVERRIDING: it is used by us in many class if we updated the same method in subclass it is called overriding.
    public void add(int a,int b,int c){

   }

    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(2,3);
        c.add(2,3,4);
    }
}
//println is the best example for method overloading because with same print method in System.out.print we can  call different data-types
