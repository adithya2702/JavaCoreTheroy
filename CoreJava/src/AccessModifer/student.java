package AccessModifer;

/*
Used to scope or restrict the class
    1.public        class,same package,subclass with in package,subclass in other package,other package
    2.protected     class,same package,subclass with in package,subclass in other package
    3.default       class,same package,subclass with in package
    4.private       class
 */
//a class cannot be private and protected
public class student {
    public int num=10;
    private int num3=20;

    int num4=50;//default means not specify anything
    protected int num5 = 500;//same as default but access in subclass in other package
    public /*constructor can also be private*/student(){
        num=200;
    }
    public void print(){
        System.out.println(num);
        //System.out.println(num2);
    }
    private void print2(){
        System.out.println(num);
        int num2=200;
    }
}
