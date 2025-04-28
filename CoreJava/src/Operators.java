/*
5 types
1. Arithmetic       +,-,*,/,%
2. Unary            ++,--           we can use pre and post for this operator
3. Relational       ==,!=,>,<,>=,<=
4. Conditional      &&,||
5. Assignment       =,+=,-=,*=,/=,%=
 */

public class Operators {
    public static void main(String[] args) {
        int x=20;
        int y=10;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        System.out.println(x);//20
        System.out.println(++x);//21
        System.out.println(x++);//21
        System.out.println(x);

        System.out.println(x+=5);// x=x+5
        System.out.println(x%=5);// x=x%5 remainder

        int i=0;
        int k= i++ + ++i + i-- - --i;
        System.out.println(k);
    }
}
/*
    1) What are operators in Java?
        Answer: Operators are special symbols in Java that perform operations on variables and values.
    2) What are the different types of operators in Java?
        Answer: Java operators can be categorized into several types:
                Arithmetic Operators: +, -, *, /, %
                Relational Operators: ==, !=, >, <, >=, <=
                Logical Operators: &&, ||, !
                Bitwise Operators: &, |, ^, ~, <<, >>, >>>
                Assignment Operators: =, +=, -=, *=, /=, %=
                Unary Operators: +, -, ++, --, !
                Ternary Operator: ? :
                InstanceOf Operator: instanceof
    3) What is the purpose of the unary + and - operators?
        Answer: Unary + and - operators are used to indicate positive and negative values, respectively. They do not change the value of the variable but can be used to clarify intent.
//        int a = 10;
//        System.out.println(+a);  // Output: 10
//        System.out.println(-a);  // Output: -10
    4) What is the instanceof operator used for?
        Answer: The instanceof operator checks if an object is an instance of a specific class or subclass.
//        String str = "Hello";
//        System.out.println(str instanceof String);  // Output: true
    5) How do you handle integer overflow in Java?
        Answer: Java does not automatically handle integer overflow. To prevent overflow, you can use larger data types (e.g., long instead of int) or perform checks before operations to ensure values stay within a safe range.
 */