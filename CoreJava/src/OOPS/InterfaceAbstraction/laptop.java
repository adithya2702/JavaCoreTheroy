package OOPS.InterfaceAbstraction;
//Interface is blueprint of class. Interface is what to do in high level but in class we decide how to do.Implementation of interface is class.
//until java8 we use interface only for what to do after that we can use it as a class. java 8 is huge change.
public interface laptop {
    public void copy();
    public void cut();
    public void paste();
    public void keyboard();

    //java8 and above, To provide implementation in interface we can use default keyword for default access modifier(we cannot use this in class but can in interfaces) or static method
    default void security(){
        System.out.println("U can implement it ");
    }
    /*it is default public */static void video(){
        System.out.println("this is video code");
    }
    //java9 and above, we can use private because to decrease code re-usability in same interface it can be static or nonstatic.
    //this can be static because not to get error like nonstatic methods cannot be called in static methods.
    private static void commomCode(){

    }
}
