

public class ConvertStringtoTitleCase {
    public static void main(String[] args) {
        System.out.println(change("this is a    CODECHEF problem"));
    }
    public static String change(String s){
        String[] a = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length;i++){

            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1));
            sb.append(" ");
        }
        return sb.toString();
    }
}
