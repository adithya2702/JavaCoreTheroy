package AccessModifer;

public class teacher {
    public void school(){

    }

    public static void main(String[] args) {
        student s = new student();//we can access here because it is public with in same package can be used
        System.out.println(s.num);
        s.print();
        //System.out.println(s.num3); private cannot be access outside class
    }
}
