import java.util.LinkedList;
import java.util.Scanner;
public class mergeKSortedLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int [][] arr= new int [n][];
        for (int i=0; i<n; i++) {
            int size = sc.nextInt();
            arr[i] =  new int[size];
            for(int j=0; j<size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
