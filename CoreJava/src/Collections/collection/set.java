package Collections.collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Set is designed because to restrict duplicate elements. It won't store duplicate data but not throw error if we want to store it just skip.
//HashSet internally store value in -> HashMap(not hashtable,hashmap is taken because in those keys are unique so this logic is used) -> Array of nodes(key,value)
public class set {
    public static void main(String[] args) {
        //Creation of set
        HashSet<Integer> hs = new HashSet<>();//same as LinkedHashSet and TreeSet but internal implementation is same
        //Addition of ele- Using a hashcode it stores data in that order
        hs.add(1);//these will be keys in hashMap and the values are dummy objects
        hs.add(12);
        hs.add(5);
        hs.add(50);
        hs.add(25);
        hs.add(50);//it doesn't add because already 50 is used, so it skip
        System.out.println(hs);
        //Retrieval of ele
        for(int ele:hs){
            System.out.println(ele);
        }
        //Deletion of ele
        hs.remove(50);//***here 50 is data not index
        //Verification of ele
        hs.contains(20);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());


        //LinkedHashSet
        //LinkedHashSet maintains the order to add elements and its internal implementation -> LinkedHashMap -> list of nodes(key,value).
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();//same as LinkedHashSet and TreeSet but internal implementation is same
        //Addition of ele- Using a hashcode it stores data in that order
        lhs.add(1);//these will be keys in hashMap and the values are dummy objects
        lhs.add(12);
        lhs.add(5);
        lhs.add(50);
        lhs.add(25);
        lhs.add(50);

        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        //TreeSet -> TreeMap -> binary tree.
        //Tree set gives sorted order
        int[] a ={1,2,3};
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(19);
        ts.add(1);
        ts.add(5);
        ts.add(10);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.subSet(5,19));//it takes the range values include 5 not and 19
        //if we perform any operation in subset it effects the main tree set
        System.out.println(ts);
        hs.clear();
        ts.clear();
        lhs.clear();
    }
}
//HashSet and LinkedHashSet allow null values but not TreeSet
//Refer the saved files on core jav folder fot questions to answer