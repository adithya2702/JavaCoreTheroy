import java.util.Scanner;
public class arrayRotation {
    static void rot(int arr[], int pos){
        int [] a = new int[pos];
        for(int i=0; i<pos; i++){
            a[i] = arr[i];
        }
        for(int i=pos; i<arr.length;i++){
            arr[i-pos] = arr[i];
        }
        for(int i=0; i<pos; i++){
            arr[i+arr.length-pos] = a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        rot(arr,pos);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
