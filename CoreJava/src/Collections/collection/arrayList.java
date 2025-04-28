package Collections.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class  arrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(2);
        al1.add(0,10);
        System.out.println(al1.get(1));
        System.out.println(al1.remove(1));
        //addition,deletion,retrieval and updation all are same
        System.out.println(al1);
        System.out.println(al1.size());
        ArrayList<Integer> al2 = new ArrayList<>(5);//we acn specify size

        //convert array to ArrayList
        Integer [] arr = new Integer[]{1,3,6,2,4};
        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(arr));
        Collections.synchronizedList(al1);//it indirectly works as vector to make arraylist synchronized
    }
}
/*
    ArrayList is created than vector because it is default created with zero size and it can handle multiple threads at a time by this confusion occurs we can handle it by synchronisation class.here we can save some memory.
        a) What is default capacity
            0
        b) What is the initial capacity
            10
        c) Does it allow duplicate elements
            yes
        d) Does it allow null elements
            yes
        e) Does it maintain the insertion order
            YES
        f) Does it maintained the sorted order
            NO
        g) Does it offer hte random access to elements
            YES
        h) Is it synchronised(multiple thread handled in sequence)
            No(it can handled in line by line)
            But by using synchronised clas we can make it
        i) What is it good at
            it increase size by 50% and good to store and retrieve data.
 */