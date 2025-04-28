package OOPS.InterfaceAbstraction;

//abstract class means in which we create abstract methods(means unimplemented method).
//abstract class is middle of class and interface. If we want to implement a interface to class we need to code every method in interface to class but a 3rd part vendor use abstract class to code some methods in interface but not mandatory all
//process of hiding implementation and giving only functionality.
public abstract class studentAbstract implements laptop {
    public void copy(){
        System.out.println("u can copy");
    }
    //here we didn't get any error to create all methods that are in interface because the class is abstract.
    //@Override//it is not mandatory to write it but if done any mistake when initializing then compiler throws exception if we write it.
    public void paste(){

    }

}