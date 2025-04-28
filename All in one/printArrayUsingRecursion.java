import java.util.Scanner;
public class printArrayUsingRecursion {
    public static void main(String[] args) {
        int []a =new int[]{1,2,3,4,5};
        print(a,a.length);
    }
    public static int print(int[]a,int idx){
        if(idx<a.length){
            System.out.println(a[idx]);
        }else{
            return -1;
        }
        return print(a,a[idx+1]);
    }
}
