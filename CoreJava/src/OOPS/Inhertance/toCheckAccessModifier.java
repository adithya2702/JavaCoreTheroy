package OOPS.Inhertance;

import AccessModifer.student;

public class toCheckAccessModifier extends student{
    public static void main(String[] args) {
        toCheckAccessModifier s = new toCheckAccessModifier();//we can access here because it is public with in other packages can be used
        System.out.println(s.num);
        //System.out.println(s.num4); cannot access default outside the package
        System.out.println(s.num5); //it is no error because it is protected access modifier
        s.print();
    }
}
