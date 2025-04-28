import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class googleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = findMaxXorSum(a, k);
        System.out.println(max);
    }

    public static int findMaxXorSum(int[] a, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(a, 2 * k, 0, new ArrayList<>(), combinations);

        int max = Integer.MIN_VALUE;
        for (List<Integer> combination : combinations) {
            int sum = 0;
            for (int j = 0; j < combination.size() - 1; j++) {
                sum += combination.get(j) ^ combination.get(j + 1);
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void generateCombinations(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            generateCombinations(arr, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}