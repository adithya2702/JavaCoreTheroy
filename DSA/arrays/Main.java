import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insertion at specific index");
            System.out.println("2. Deletion of specific element");
            System.out.println("3. Sort the array");
            System.out.println("4. Search for an element");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertAtIndex(arr);
                    break;
                case 2:
                    deleteElement(arr);
                    break;
                case 3:
                    sortArray(arr);
                    break;
                case 4:
                    searchElement(arr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void insertAtIndex(int[] arr) {
        System.out.print("Enter the index where you want to insert: ");
        int pos = sc.nextInt();
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        int[] temp = new int[arr.length + 1];
        for (int i = 0, j = 0; i < temp.length; i++, j++) {
            if (i == pos) {
                temp[i] = element;
                j--;
            }
            else {
                temp[i] = arr[j];
            }
        }
        arr = temp;
        System.out.println("Element inserted successfully.");
        System.out.println("Updated Array elements:");
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void deleteElement(int[] arr) {
        System.out.print("Enter the element to delete: ");
        int ele = sc.nextInt();

        int[] temp = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++,j++) {

            if (arr[j] == ele) {
                System.out.println("The position of element" + ele +"is at " + i);
                continue;
            }
            else{
                temp[i]=arr[j];
            }
        }
        arr = temp;
        System.out.println("Element deleted successfully.");
        System.out.println("Updated Array elements:");
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array sorted successfully.");
        System.out.println("Array elements:");
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    private static void searchElement(int[] arr) {
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("Element found at index " + i + ".");
                found = true;
                break;
            }
            if (!found) {
                System.out.println("Element not found");
            }
        }
    }
}
