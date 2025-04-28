import com.sun.tools.javac.Main;

//In java Strings are immutable so java introduced a concept string buffer
//It is different from string builder in one case that is it thread safe as it allow one after one.
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//By default
        StringBuffer sb2 = new StringBuffer("Adithya");
        StringBuffer sb3 = new StringBuffer(25);
        sb.append("hi");
        sb.append("guys");
        sb.insert(2," ");
        System.out.println(sb);

        sb.replace(3,7,"bro");
        System.out.println(sb);
        String s = "h i h   ee l o ";
        System.out.println(s.replaceAll(" ",""));
    }
}
