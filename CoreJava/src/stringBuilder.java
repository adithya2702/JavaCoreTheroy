//In java Strings are immutable so java introduced a concept string builder
//It is mutable we can edit object without creating new object but strings are immutable
//It is efficient, and it allows multiple threads.
import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hii");

        //get value of character at a index
        System.out.println(sb.charAt(0));

        //set character at index it will modify
        sb.setCharAt(2,'e');
        System.out.println(sb);

        //to insert a character at index by that the right shift elements happen
        sb.insert(0,'H');
        System.out.println(sb);

        //delete a character in string
        sb.delete(1,2);//it deletes from 1 to 2 but not 2
        System.out.println(sb);

        //to insert in the last we use append it adds on last
        sb.append("e");
        System.out.println(sb);
        sb.append(" bro");
        System.out.println(sb);

        //Convert to string
        String str = sb.toString();
        System.out.println(str);
    }
}
