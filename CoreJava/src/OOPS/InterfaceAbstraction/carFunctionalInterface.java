package OOPS.InterfaceAbstraction;

//If any interface have only one abstract method then it is called functional interface
@FunctionalInterface // if we keep this annotation then we cannot add more than one abstract method on this
public interface carFunctionalInterface {
    void drive();

    //we can add any number of non-abstract methods
    default void honk(){

    }
    static void light(){

    }
    private void breaks(){

    }
}
