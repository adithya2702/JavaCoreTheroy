import java.util.Scanner;

public class keypadPhoneNumberCombinations {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        phoneCom(Integer.toString(n),"");
    }
    static String [] a ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void phoneCom(String s,String ans){
        if(s.isEmpty()) {
            System.out.println(ans+" ");
            return;
        }
        String num = a[(int)s.charAt(0)];
        for(int i=0;i<num.length();i++){
            //phoneCom();
        }
    }
}
