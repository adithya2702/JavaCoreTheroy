import java.util.Scanner;
class Main{
//    public static boolean match(String s1,String s2,int i,int j){
//        if(i==s1.length() && j==s2.length()) return true;
//        if(i==s1.length()) return false;
//        if(j==s2.length()) return match(s1,s2,i+1,j);
//        char c1 = s1.charAt(i);
//        char c2 = s2.charAt(j);
//        if (c1 == '*') {
//            return match(s1,s2,i+1,j) || match(s1,s2,i,j+1);
//        }
//        if(c1==c2 || c1 == '?'){
//            return match(s1,s2,i+1,j+1);
//        }
//        return false;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        System.out.println(match(s1,s2,0,0));
        System.out.println(com(s1,s2));
    }
    public static boolean com(String s1,String s2){
        int i=0;

        for(int j=0;j<s2.length();){
            if(s1.charAt(i)!=s2.charAt(j)) j++;
            if(j<s2.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
        }
        if(i==s1.length()) return true;
        else return false;
    }
}