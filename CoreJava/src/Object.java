//Object is instance of class. class is blueprint and object allocate memory for class
public class Object {
    int a,b;
    public Object(){
        a=10;
        b=20;
    }
    public Object(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int add(){
        return a+b;
    }
    public static void main(String[] args) {
        Object obj1 = new Object();
        //We can create one class objet in other class with this class name there is no restrictions depends on access modifier
        Object obj2 = new Object(20,30);
        Object obj3 = new Object(100,200);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj1.add());
        System.out.println(obj2.add());
        System.out.println(obj3.add());
    }
}
