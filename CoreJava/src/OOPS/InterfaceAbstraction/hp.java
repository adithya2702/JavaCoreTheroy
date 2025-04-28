package OOPS.InterfaceAbstraction;
// To implement the interface laptop we use keyword implements
public class hp implements laptop{
    @Override
    public void copy() {
        System.out.println("hp copy code");
    }

    @Override
    public void cut() {
        System.out.println("hp cut code");
    }

    @Override
    public void paste() {
        System.out.println("hp paste code");
    }

    @Override
    public void keyboard() {
        System.out.println("hp keyboard code");
    }
    public void msofficeAccount(){
        System.out.println("Free account for ms office");
    }
}
