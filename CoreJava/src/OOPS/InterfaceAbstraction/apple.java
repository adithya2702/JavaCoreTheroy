package OOPS.InterfaceAbstraction;

public class apple  /* use implements first i used extends to see the concept of abstraction*/extends studentAbstract{
    @Override//we can remove this override not mandatory
//    public void copy() {
//        System.out.println("apple copy code");
//    }

    public void cut() {
        System.out.println("apple cut code");
    }

    @Override
    public void paste() {
        System.out.println("apple paste code");
    }

    @Override
    public void keyboard() {
        System.out.println("apple keyboard code");
    }
    @Override//Here we can use override to specify that this is not this apple own method but oit is not mandatory.
    public void security(){
        System.out.println("apple security");
    }

    public static void main(String[] args) {
        apple a = new apple();
        a.copy();//if we uncomment the copy method in this class and press (command+B)we are directed to same class method here because it is called overriding
        a.paste();
    }
}
