package Collections.collection;
import java.util.Stack;
/*Stack extends vector. and also stack have some more features
    LIFO - last in first out -Stack
    FIFO - first in first out -Queue
*/
public class stack {
    public static void main(String[] args) {
        Stack<String> book = new Stack<>();//***stack cannot be created with specified size
        //Creation, insertion,deletion,updation, verification, retrieval all are same as arraylist and vector
        book.add("red");
        book.add("yellow");
        book.add("black");
        System.out.println(book);
        book.set(0,"blue");
        System.out.println(book);
        System.out.println(book.get(1));
        //Special methods in stack
        /*
            push(same as add, add in top)
            pop(remove top)
            peek(see the top element)
            search(starts from top and starts with 1)
            isEmpty
         */
        System.out.println(book.peek());
        System.out.println(book.search("black"));
        System.out.println(book.indexOf("black"));//index starts from zero
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
        g) Does it offer the random access to elements
            YES(we should not use it to differ from vector)
        h) Is it synchronised(multiple thread handled one by one)
            yes
        i) What is it good at
            it increase size by 100% and also good for  LIFO type data .
 */