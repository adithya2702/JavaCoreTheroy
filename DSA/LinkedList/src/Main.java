import java.util.*;
public class Main {
   public static void main(String[] args) {
      String s="madam";
      StringBuilder sb= new StringBuilder(s);
      System.out.println(s.equals(sb.reverse().toString()));
   }
}