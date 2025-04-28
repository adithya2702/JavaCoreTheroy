package Collections.collection;
import java.util.*;
//If we want to specify priority we use method Comparator example here lest take high number high order
public class queue {
    public static void main(String[] args) {
        //Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()/*this reverse your priority*/);//pq is created initially as objected type of array value is null
        //Addition - Offer,add
        //Retrieval - peek
        //Removal - poll,remove
        pq.add(1);
        pq.add(3);
        pq.offer(2);
        pq.offer(8);
        pq.add(5);
        //In PriorityQueue elements do not any oder but always head will be high priority remaining can be in any order. In integer the lowest value is the highest priority
        System.out.println(pq);

        //we can only see head
        System.out.println(pq.peek());
        //delete
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.remove());//it also works as poll but if we have empty pq then it shows error but poll returns null
        System.out.println(pq.contains(5));

        //we don't use foreach loop in pq because it prints in the values in form it is created not in priority oder
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        //ArrayDeque is 2 way we can add or delete in head and tail.
        ArrayDeque<Integer> ad  = new ArrayDeque<>();//we can also use LinkedList here in place of ArrayDeque all these methods works
        //Addition - offer,offerFirst,offerLast,add,addFirst,addLast
        //Retrieval - peek,peekFirst,peekLast
        //Removal - poll,remove,pollFirst,pollLast,removeFirst,removeLast

        //add follows add order
        ad.add(3);
        ad.addFirst(5);
        ad.offerLast(1);
        ad.offerFirst(5);
        ad.addLast(8);
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.size());

        pq.clear();
    }
}
/*
        a) What is default capacity
            11
        b) What is the initial capacity
            11
        c) Does it allow duplicate elements
            yes
        d) Does it allow null elements
            no
        e) Does it maintain the insertion order
            no
        f) Does it maintained the sorted order
            NO
        g) Does it offer hte random access to elements
            no
        h) Is it synchronised(multiple thread handled in a sequence
            no
        i) What is it good at
            if we want to create priority
*/