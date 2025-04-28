import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class naturalSortOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] data = inputLine.split(" ");

        Arrays.sort(data, new NaturalOrderComparator());

        for (String str : data) {
            System.out.print(str + " ");
        }

        sc.close();
    }
}

class NaturalOrderComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return new AlphanumericComparator().compare(s1, s2);
    }
}

class AlphanumericComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return Integer.compare(
                Integer.parseInt(s1.replaceAll("\\D", "")),
                Integer.parseInt(s2.replaceAll("\\D", ""))
        );
    }
}
