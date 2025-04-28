// Define a binary tree node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class boundaryTreeTraversal {
    // Helper method to print the left boundary of the tree
    private static void printLeftBoundary(TreeNode root) {
        if (root == null)
            return;

        if (root.left != null) {
            System.out.print(root.data + " ");
            printLeftBoundary(root.left);
        } else if (root.right != null) {
            System.out.print(root.data + " ");
            printLeftBoundary(root.right);
        }
    }

    // Helper method to print the leaf nodes of the tree
    private static void printLeaves(TreeNode root) {
        if (root == null)
            return;

        printLeaves(root.left);

        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");

        printLeaves(root.right);
    }

    // Helper method to print the right boundary of the tree
    private static void printRightBoundary(TreeNode root) {
        if (root == null)
            return;

        if (root.right != null) {
            printRightBoundary(root.right);
            System.out.print(root.data + " ");
        } else if (root.left != null) {
            printRightBoundary(root.left);
            System.out.print(root.data + " ");
        }
    }

    // Main method to perform boundary traversal
    public static void boundaryTraversal(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");

        printLeftBoundary(root.left);

        printLeaves(root.left);
        printLeaves(root.right);

        printRightBoundary(root.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform boundary traversal
        boundaryTraversal(root);
    }
}
