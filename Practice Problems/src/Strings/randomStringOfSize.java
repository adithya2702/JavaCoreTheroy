package Strings;

import java.util.Scanner;
import java.util.Random;
public class randomStringOfSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(generate(n));
    }
    public static String generate(int n){
        StringBuffer sb = new StringBuffer(n);
        Random ran = new Random();
        for(int i=0;i<n;i++){
            char c = (char)(97+ran.nextFloat()*26);
            sb.append(c);
        }
        return sb.toString();
    }
}
