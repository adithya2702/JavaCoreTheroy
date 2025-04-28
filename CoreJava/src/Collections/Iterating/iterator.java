package Collections.Iterating;

import java.util.*;

/*
    Iterator- Interface
    Introduced to iterate legacy classes(introduced in java 1.0) and new class(v1.2)
    legacy classes - HashTable,Stack,Vector,Dictionary(abstract class) and Properties
    New classes - ArrayList,HashMap,Queue
    It is one directional,read-only with special permission for removing
 */
public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(85);
        al.add(78);

        Iterator<Integer> i = al.iterator();
        //i.hasNext() - checks absence of element
        //i.next() - used to print
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //i.remove()-to remove
        while(i.hasNext()){
            i.next();//***initially the iterator not points to anything if we use next() then it points first index so to remove we use first i.next()
            i.remove();
        }
        System.out.println(al);


        //Iterator cannot be used on map Interfaces directly
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("adi",100);
        hm.put("Suhail",200);
        hm.put("Harsha",300);
        hm.put("killer",400);

        //we cannot use .elements directly so we can change to set type
        Iterator<Map.Entry<String, Integer>> i2 =hm.entrySet().iterator();
        while(!i2.hasNext()){
            System.out.println(i2.next());
        }
        //or we can do
    }

}
