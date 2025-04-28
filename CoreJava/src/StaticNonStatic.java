public class StaticNonStatic {

    //Static block
    static {
        System.out.println("Static block");//static block will first execute then the main method but to execute it we need main method
    }
    //non-static block
    {
        System.out.println("Non static block");//non-static block will execute first before the constructor but after the main method
    }
    public StaticNonStatic(){
        System.out.println("Constructor");
    }
    public void print(){
        System.out.println("Method");
    }
    public static void main(String[] args) {
        new StaticNonStatic().print();
        System.out.println("Main method");
        //If we create an object then

    }
    //Static blocks can be so many and are executed based on created order
    //To assign values to Static variables assign in static block because if we assign in non-static block it we called multiple no of times when the object is created it is waste of time but static block is called only one.
    // We can't call non-static in static methods but we can static in no-static methods
}
