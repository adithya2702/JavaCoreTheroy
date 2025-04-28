import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class successorBT {
    private static class Node {
        int val;
        Node left, right;

        Node(int data) {
            this.val = data;
        }
    }
    private static Node root = null;
    public static Node create(String[] arr) {
        if (arr == null || arr.length == 0 || arr[0].equals("null")) {
            return null;
        }
        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.length) {
            Node node = q.poll();
            if (!arr[i].equals("null")) {
                node.left = new Node(Integer.parseInt(arr[i]));
                q.add(node.left);
            }
            i++;
            if (i < arr.length && !arr[i].equals("null")) {
                node.right = new Node(Integer.parseInt(arr[i]));
                q.add(node.right);
            }
            i++;
        }
        return root;
    }
    public static Node successor(Node root, int n) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
            if(node.val==n) break;
        }
        return q.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s");
        root = create(a);
        int n = sc.nextInt();
        System.out.println(successor(root, n).val);
    }
}