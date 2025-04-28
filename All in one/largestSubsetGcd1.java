import java.util.*;
import java.util.List;

public class largestSubsetGcd1 {
    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static int gcd(List<Integer> l) {
        if (l.isEmpty()) return 0;
        int num = l.get(0);
        for (int i = 1; i < l.size() ; i++) {
            num = gcd(num,l.get(i));
            if (num == 1) break;
        }
        return num;
    }

    static List<List<Integer>> subset(int[] a) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < a.length; i++) {
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(a[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    static void gcdSubset(int[] arr) {
        List<List<Integer>> list = subset(arr);
        Collections.sort(list, (a, b) -> Integer.compare(b.size(), a.size()));
        for (List<Integer> lists : list) {
            if (gcd(lists) == 2) {
                System.out.print(lists);
                break;
            }
        }
    }

    static int gcdOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) break; // The smallest possible GCD is 1
        }
        return result;
    }

    // Find the largest subset with GCD of 1
    static void findLargestSubsetWithGCD1(int[] arr) {
        int overallGCD = gcdOfArray(arr);
        if (overallGCD == 1) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2};
        findLargestSubsetWithGCD1(a);
        gcdSubset(a);
    }
}
