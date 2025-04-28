import java.util.Arrays;
import java.util.Scanner;
public class longPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int n= s.length();
        int l = n*2+3;
        char [] arr = new char[l];
        int [] arr2 = new int[l];
        arr[0] = '#';
        arr[l-1] = '@';
        arr[l-2] = '#';
        for(int i=0; i<n; i++){
            arr[2*i+1]='#';
            arr[2*i+2]=s.charAt(i);
        }
        for(int i=1;i<l-1;i++){
            while(arr[i+(1+arr2[i])]==arr[i-(1+arr2[i])]){
                arr2[i]++;
            }
        }
        int length = 0;
        int center = 0;
        for(int i=0; i<l;i++){
            if(arr2[i]>length){
                length = arr2[i];
                center = i;
            }
        }
        String res = s.substring((center - length - 1) / 2, (center + length - 1) / 2);
        System.out.println(res);
    }
}
