import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candidates = new int[n];
        int target = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }
        List<List<Integer>> result = combinationSum(candidates, target);
        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
