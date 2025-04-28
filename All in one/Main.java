import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class main{
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(3);
        v.add(5);
        System.out.println(v);
        v.set(1,7);
        System.out.println(v);
    }
}