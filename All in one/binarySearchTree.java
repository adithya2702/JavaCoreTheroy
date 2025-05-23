import java.util.Scanner;

public class binarySearchTree {
    static int optCost(int freq[], int i, int j) {
        if (j < i)
            return 0;
        if (j == i)
            return freq[i];
        int fsum = sum(freq, i, j);
        int min = Integer.MAX_VALUE;
        for (int r = i; r <= j; ++r) {
            int cost = optCost(freq, i, r - 1) + optCost(freq, r + 1, j);
            if (cost < min)
                min = cost;
        }
        return min + fsum;
    }

    static int optimalSearchTree(int keys[], int freq[], int n) {

        return optCost(freq, 0, n - 1);
    }

    static int sum(int freq[], int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += freq[k];
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Nodes: ");
        int n = scanner.nextInt();
        int[] keys = new int[n];
        int[] freq = new int[n];
        System.out.println("Enter Node values:");
        for (int i = 0; i < n; i++) {
            keys[i] = scanner.nextInt();
        }
        System.out.println("Enter corresponding frequencies:");
        for (int i = 0; i < n; i++) {
            freq[i] = scanner.nextInt();
        }
        System.out.println("Cost of Optimal BST is " + optimalSearchTree(keys, freq, n));
    }
}