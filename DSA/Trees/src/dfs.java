import java.util.*;

public class dfs {
    private static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    public void dfsUsingStack(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            // Process the node
            System.out.print(node.val + " ");

            // Push right and left children to stack
            // Note: Push right first so left child is processed first
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        dfs tree = new dfs();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("DFS traversal of binary tree using stack:");
        tree.dfsUsingStack(root);
    }
}
