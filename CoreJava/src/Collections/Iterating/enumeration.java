package Collections.Iterating;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/*
    Enumeration- Interface
    Introduced to iterate legacy classes(introduced in java 1.0)
    legacy classes - HashTable,Stack,Vector,Dictionary(abstract class) and Properties
    New classes - ArrayList,HashMap,Queue
    It is one directional,read-only
 */
public class enumeration {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        //Add data
        v.add(1);
        v.add(10);
        v.add(5);
        v.add(1220);
        Enumeration<Integer> e = v.elements();

        //We have to method in enumeration
        //e.hasMoreElements() - checks the absence of next element
        //e.nextElement() - returns data
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        //we can only read data here in one order only

        Hashtable<String,Integer> h = new Hashtable<>();
        h.put("Adi",500);
        h.put("Suhail",1000);
        h.put("Sudha",800);
        Enumeration<Integer> e2 = h.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
