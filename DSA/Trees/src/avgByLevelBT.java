import java.util.*;

public class avgByLevelBT {
    private static class Node{
        int val;
        Node left,right;
        Node(int data){
            this.val=data;
        }
    }
    private static Node root=null;
    public static Node create(String[] arr){
        if (arr == null || arr.length == 0 || arr[0].equals("null")) {
            return null;
        }
        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<arr.length){
            Node node = q.poll();
            if(!arr[i].equals("null")){
                node.left = new Node(Integer.parseInt(arr[i]));
                q.add(node.left);
            }
            i++;
            if(i<arr.length && !arr[i].equals("null")){
                node.right = new Node(Integer.parseInt(arr[i]));
                q.add(node.right);
            }
            i++;
        }
        return root;
    }
    public static List<Double> averageLevel(Node root){
        List<Double> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            double sum=0;
            for(int i=0;i<levelSize;i++) {
                Node node = q.poll();
                sum+=node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(sum/levelSize);
        }
        return ans;
    }
    public static int depth(Node node){
        if(node==null){
            return 0;
        }
        int left=depth(node.left);
        int right=depth(node.right);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s");
        root = create(a);
        System.out.println(averageLevel(root));
        System.out.println(depth(root));
    }
}
