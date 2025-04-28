import java.util.*;

public class zigzagLevelOrderTraversal {
    private static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
        }
    }
    private static Node root=null;
    public static Node create(String [] arr){
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
    public static List<List<Integer>> zigzag(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        int depth=0;
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = q.size();
            if(depth%2==0) {
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
                depth++;
                ans.add(level);
            }
            else{
                for (int i=levelSize-1;i>=0;i--) {
                    Node temp = q.removeLast();
                    level.add(temp.data);
                    if (temp.right != null) {
                        q.addFirst(temp.right);
                    }
                    if (temp.left != null) {
                        q.addFirst(temp.left);
                    }
                }
                depth++;
                ans.add(level);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s");
        root = create(a);
        List<List<Integer>> ans = zigzag(root);
        for (List<Integer> list : ans) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//8 5 7 10 15 9 null 20 19 null 2 null 11