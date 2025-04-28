package Collections.Map;
import java.util.*;
import java.util.Map.*;
//for hierarchy refer file core java in finder
/*
    Major Operations in classes(hashmap,linkedHashmap,hashtable,treemap) that implements map Interface
        * Creation of map class
        * Add element
        * Retrieve keys
        * Retrieve values
        * Delete elements
        * Verification of keys
        * Verification of values
        * Updation of elements
 */
//Map is a data structure which is in the form of key value pair. key value pair is also called entry
public class map {
    public static void main(String[] args) {
        Map<Integer,String> m = new Hashtable/* we can use HashMap,TreeMap,LinkedHashMap*/<>();
        //put method to add
        m.put(101,"Adithya");
        m.put(102,"Suhail");
        m.put(103,"Baby");
        //Retrieval of keys from map
        Set<Integer> keys = m.keySet();//to get all key values we use ketSet method it returns Set to we store in Set
        for(Integer key:keys){
            System.out.println(key);
        }
        //Retrieval of values from map
        Collection<String> values = m.values();
        for(String value :values){
            System.out.println(value);
        }
        String s="101";
        //Retrieval of value with key
        System.out.println(m.get(102));
        //Retrieval kay and value
        for(int key: keys){
            System.out.println(key+" - "+m.get(key));
        }

        //Deletion
        m.remove(101);


        //check with key
        System.out.println(m.containsKey(103));
        //check with value
        System.out.println(m.containsValue("Adithya"));

        //Updation of value
        m.put(103,"Yeswanth");
        m.replace(103,"Yeswanth");//we can use both put and replace
        System.out.println(m);

        //It will not override if we use putIfAbsent
        m.putIfAbsent(103,"Sukesh");


        System.out.println(m.size());
        Set<Entry<Integer,String>> entries = m.entrySet();

        for(Entry<Integer,String > entry: entries){
            System.out.println(entry);
        }
        System.out.println(m.getOrDefault(102,""));//This method returns the value in key if there is no key then default value of that data type is returned
        m.clear();
    }
}
