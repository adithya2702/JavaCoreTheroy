import java.util.Scanner;

public class diceCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        dice("",n);
    }
    static void dice(String s,int target){
        if(target==0) {
            System.out.println(s);
            return;
        }
        for(int i=1;i<=target;i++){
            dice(s+i,target-i);
        }
    }
}
