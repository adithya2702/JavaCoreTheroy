import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }

}

public class binaryTree {
    static class BinaryTree {
        Node root;
        int largestBSTSize;

        public BinaryTree() {
            root = null;
            largestBSTSize = 0;
        }

        // Function to construct a binary tree from a parent array in level-order fashion
        public void buildTree(int[] parent) {
            Map<Integer, Node> map = new HashMap<>();
            for (int i = 0; i < parent.length; i++) {
                map.put(i, new Node(i));
            }

            for (int i = 0; i < parent.length; i++) {
                int p = parent[i];
                if (p == -1) {
                    root = map.get(i);
                } else {
                    Node parentNode = map.get(p);
                    if (parentNode != null) {
                        if (parentNode.left == null) {
                            parentNode.left = map.get(i);
                        } else {
                            parentNode.right = map.get(i);
                        }
                    }
                }
            }
        }

        // Helper function to find the largest BST in a binary tree
        private int findLargestBSTUtil(Node node, int min, int max) {
            if (node == null) {
                return 0;
            }

            if (node.data < min || node.data > max) {
                return -1; // Not a BST
            }

            int leftSize = findLargestBSTUtil(node.left, min, node.data);
            int rightSize = findLargestBSTUtil(node.right, node.data, max);

            if (leftSize == -1 || rightSize == -1) {
                return -1; // Not a BST
            }

            int totalSize = leftSize + rightSize + 1;
            largestBSTSize = Math.max(largestBSTSize, totalSize);

            return totalSize;
        }

        // Function to find the largest BST in a binary tree
        public int findLargestBST() {
            largestBSTSize = 0;
            findLargestBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
            return largestBSTSize;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of nodes in the binary tree
        int n = scanner.nextInt();

        // Read the parent array
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = scanner.nextInt();
        }

        // Construct the binary tree
        BinaryTree tree = new BinaryTree();
        tree.buildTree(parent);

        // Find the size of the largest BST in the binary tree
        int largestBSTSize = tree.findLargestBST();

        // Print the result
        System.out.println(largestBSTSize);

        scanner.close();
    }
}
