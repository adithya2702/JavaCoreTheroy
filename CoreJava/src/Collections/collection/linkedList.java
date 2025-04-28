package Collections.collection;
import java.util.*;

//LinkedList is a class can implements list and queue;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> de = new LinkedList<>();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("adi");
        ll.add("suhail");
        ll.add("harsha");
        System.out.println(ll);

        //same methods what we do in ArrayList and Vector are used here

        //ArrayList add to LinkedList
        ArrayList<String> al = new ArrayList<>();
        al.add("pavan");
        al.add("baby");
        ll.addAll(al);
        System.out.println(ll);
        //here the get method works by divide the ll size into half and if index<size/2 it searches left from 0 and if grater then search from size/2 right side
        System.out.println(ll.get(3));


    }
}
/*
        a) What is default capacity
            0
        b) What is the initial capacity
            0
        c) Does it allow duplicate elements
            yes
        d) Does it allow null elements
            yes
        e) Does it maintain the insertion order
            YES
        f) Does it maintained the sorted order
            NO
        g) Does it offer the random access to elements
            YES(we should not use it to differ from vector)
        h) Is it synchronised(multiple thread are handled one by one)
            NO
            But we can make using collections.synchronizedList() we can make
        i) What is it good at
            it is good for data additions and deletion because no need to shift.
 */