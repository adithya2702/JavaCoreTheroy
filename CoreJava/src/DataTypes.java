class DataTypes {
    static float f2;
    static boolean yes;
    public static void main(String[] args) {
        ///PRIMITIVE DATA TYPES
        //Integer type
        byte b= 5;
        short s= 200;
        int i= 2147483647;
        long l= 98496205969383L;

        //Decimal Type
        float f= 3.1f;
        double d= 29303893.45;

        //Boolean type
        boolean b1=true;

        //Character type
        char c='R';
        //char ch = sc.next().charAt(0);    //In this way we take char input

        System.out.println(Byte.SIZE); // we should call with wrapper class
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.SIZE);

        System.out.println("Default value of float is: "+f2);
        System.out.println("Default value of boolean is: "+yes);
    }
}
/*  Wrapper classes are classes that encapsulate primitive data types
Byte
Short
Integer
Long
Float
Double

NON-PRIMITIVE DATA TYPES are 4 types
1. Arrays
2. Collections
3. Interface
4. Class
We cannot no size for this until the value is initialized
 */

/*
In Integer we cannot store our indian mobile numbers size not permits, so we use long to store
    1) What is the difference between float and double?
        Answer: float is a single-precision 32-bit IEEE 754 floating point, while double is a double-precision 64-bit IEEE 754 floating point. double is more precise than float.
    2) How do you convert a primitive type to its corresponding Wrapper class?
        int num = 10;
        Integer wrapperNum = Integer.valueOf(num);
    3) How do you handle precision loss in floating-point numbers?
        Answer: Be cautious with precision-sensitive calculations, and consider using BigDecimal for high precision.
 */