import java.util.Scanner;
public class toggleBitsElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            n=toggle(n);
        }
    }
    public static int toggle(int n){
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        String s2="";
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '1') s2 += '0';
            else s2 += '1';

        }
        System.out.println(Integer.parseInt(s2,2));
        return (Integer.parseInt(s2,2));
    }
}
