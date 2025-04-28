import java.util.Scanner;
public class stringOddUpperEvenReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(i%2 !=0){
                for(int j=arr[i].length()-1; j>=0; j--){
                    System.out.print(arr[i].charAt(j));
                }
                System.out.print(" ");
            }
            else{
                System.out.print(arr[i].toUpperCase());
                System.out.print(" ");
            }
        }
    }
}
