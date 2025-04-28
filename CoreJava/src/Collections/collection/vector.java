package Collections.collection;
import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("adi");
        v1.add("pavan");
        v1.add(0,"suhail");
        //size - no of elements filled in the list
        //capacity - full length of vector
        System.out.println(v1);
        System.out.println("Size "+v1.size());
        System.out.println("Capacity "+v1.capacity());

        //add two vectors
        Vector v2 = new Vector();
        v2.add("mudassir");
        v2.add("harsha");
        for(int i=0; i<v2.size(); i++){
            v1.add(v2.get(i));//get method is used to get elements
        }
        System.out.println(v1);
        //use this method to add elements
        v1.addAll(v2);
        v1.addAll(0,v2);//we can add at specific index

        System.out.println(v1.get(3));//to get
        System.out.println(v1.remove(0));//to delete
        System.out.println(v1.remove("adi"));//it find him automatically
        System.out.println(v1.removeAll(v2));
        v1.clear();//this is used clear entire list
        System.out.println(v1.contains("suhail"));
        Vector v3= new Vector (5);//we acn specify size initially by default it is 10
        v3.add("harsha");
        v3.add("mudassir");
        System.out.println(v1.containsAll(v3));//it doesn't depends on order it just find the value
        v1.set(1,"sukesh");//we should specify index
        System.out.println(v1);
        System.out.println(v1.indexOf("pavan"));
        System.out.println(v1.lastIndexOf("pavan"));

        //convert vector to array
        Object[] arr = v1.toArray();
        System.out.println(Arrays.toString(arr));//because array can't be printed directly

        //convert array to list
        Object [] a = new Object[]{1,2,3,4,5};//Here Objects represent a special data type that is mutable and can be used to store a collection of data
        Vector v4 = new Vector(Arrays.asList(a));//we use as List
        System.out.println(v4);
        v4.add("abhi");//we can add another datatype
        //If we want to specify one type of vector then that concept is called generics<>.
        //** We cannot create object for a primitive data types because object are created to class it is non-primitive data type so we can use wrapper classes to generics
        Vector<Integer> v5 = new Vector<>();//we can add only int values int this vector
        v5.add(5);
        v5.add(null);//we can also add null
        v5.add(5);//we can add duplicate elements
    }
}
/*
        a) What is default capacity
            10
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
        g) Does it offer random access to elements
            YES
        h) Is it synchronised(multiple thread handled in a sequence
            Yes(it can handled in line by line)
        i) What is it good at
            Multi threading, data is increased exponentially
 */