import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sortedUniquePermutation {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static void print(char[] temp) {
        for (char c : temp)
            System.out.print(c);
        System.out.println();
    }

    static int calculateTotal(char[] temp, int n) {
        int f = factorial(n);
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : temp) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int x : hm.values()) {
            if (x > 1) {
                f /= factorial(x);
            }
        }
        return f;
    }

    static void nextPermutation(char[] temp) {
        int i;
        for (i = temp.length - 1; i > 0; i--) {
            if (temp[i] > temp[i - 1])
                break;
        }

        int min = i;
        int x = temp[i - 1];

        for (int j = i + 1; j < temp.length; j++) {
            if (temp[j] < temp[min] && temp[j] > x)
                min = j;
        }
        char tempToSwap = temp[i - 1];
        temp[i - 1] = temp[min];
        temp[min] = tempToSwap;
        Arrays.sort(temp, i, temp.length);
        print(temp);
    }

    static void printAllPermutations(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        print(temp);

        int total = calculateTotal(temp, temp.length);
        for (int i = 1; i < total; i++) {
            nextPermutation(temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        printAllPermutations(s);

        sc.close();
    }
}
