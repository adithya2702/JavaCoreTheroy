import java.util.Scanner;

public class quickSort {
    static void quickSort(int[] arr, int first, int last) {
        int i = first;
        int j = last;
        int p = first + 1;
        while (i <= j) {
            while (arr[i] < arr[p]) {
                i++;
            }
            while (arr[p] < arr[j]) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (first < j) {
            quickSort(arr, first, j);
        }
        if (i < last) {
            quickSort(arr, i, last);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
