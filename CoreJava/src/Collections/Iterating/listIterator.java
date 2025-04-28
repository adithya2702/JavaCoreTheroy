package Collections.Iterating;

import java.util.ArrayList;
import java.util.ListIterator;

/*
    ListIterator- Interface and used for only list type of collections
    Introduced to iterate legacy classes(introduced in java 1.0)
    legacy classes - HashTable,Stack,Vector,Dictionary(abstract class) and Properties
    New classes - ArrayList,HashMap,Queue
    It is bidirectional,read and write
 */
public class listIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(85);
        al.add(78);
        ListIterator<Integer> li = al.listIterator();

        //forward direction
        while(li.hasNext()){
            System.out.println(li.next());
        }
        //backward direction
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        //add element
        li.add(45);
        li.remove();
    }
}
