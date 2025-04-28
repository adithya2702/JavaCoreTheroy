public class Constructor {
    public int i;
    public static void main(String[] args) {
        //Here we not creates the constructor we just called it by default java creates constructor is called DEFAULT CONSTRUCTOR or IMPLICIT CONSTRUCTOR
        //Default constructor is always public and parameterless. There is no return type and nonstatic and constructor name must be class name
        Constructor cr = new Constructor(50);
        System.out.println(cr.i);
    }
    //Explicit constructor is the constructor if u create same as default with public,private,protected and multiple can be created.
    public Constructor()/* Parameter less explicit constructor*/{
        i=20;
    }
    public Constructor(int a)/*Parameterised Constructor*/{
        i=a;
    }
    //If we create explicit constructor then there will be no default constructor will be created by java
}
