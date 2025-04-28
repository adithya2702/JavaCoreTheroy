import java.util.Arrays;
        import java.util.Scanner;

public class combination {
    static void generateCombinations(int[] arr, int r) {
        int[] combination = new int[r];
        nextCombination(arr, combination, 0, 0);
    }

    static void nextCombination(int[] arr, int[] combination, int current, int start) {
        if (current == combination.length) {
            System.out.println(Arrays.toString(combination));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            combination[current] = arr[i];
            nextCombination(arr, combination, current + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int r = sc.nextInt();

        Arrays.sort(arr);
        generateCombinations(arr, r);

        sc.close();
    }
}
