import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class subSeqString {
    public static void main(String[] args) {
        String s = "abc";
        subseq("", s);
        //subseqAscii("",s);
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p + c, up.substring(1));
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (int) c, up.substring(1));
        subseqAscii(p + c, up.substring(1));
    }

    static List<String> subseqlist(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subseqlist(p, up.substring(1));
        List<String> right = subseqlist(p + ch, up.substring(1));
        left.addAll(right);
        return left;
    }

    static List<String> subseqAsciiRes(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char c = up.charAt(0);
        List<String> first = subseqAsciiRes(p + c, up.substring(1));
        List<String> second = subseqAsciiRes(p + (int) c, up.substring(1));
        List<String> third = subseqAsciiRes(p, up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
