import java.util.*;

public class bfs {
    private static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split(" ");
        List<String> al = new ArrayList<>(Arrays.asList(sa));
        root = create(al);
        List<List<Integer>> ans = levelOrder(root);
        for (List<Integer> list : ans) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static Node create(List<String> list) {
        if (list.isEmpty()) return null;
        root = new Node(Integer.parseInt(list.get(0)));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < list.size(); ) {
            Node curr = q.poll();
            if (!list.get(i).equals("null")) {
                curr.left = new Node(Integer.parseInt(list.get(i)));
                q.add(curr.left);
            }
            i++;
            if (i < list.size() && !list.get(i).equals("null")) {
                curr.right = new Node(Integer.parseInt(list.get(i)));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node temp = q.poll();
                level.add(temp.data);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
