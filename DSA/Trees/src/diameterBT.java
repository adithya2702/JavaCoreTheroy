import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class diameterBT {
    private static class Node {
        int data;
        Node right, left;
        Node(int data) {
            this.data = data;
        }
    }
    private static Node root=null;
    public static Node create(int[] a){
        if(a.length==0) return root;
        Queue<Node> q = new LinkedList<>();
        root=new Node(a[0]);
        int i=1;
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            if(i<a.length && a[i]!=-1){
                node.left = new Node(a[i]);
                q.add(node.left);
            }
            i++;
            if(i<a.length && a[i]!=-1){
                node.right = new Node(a[i]);
                q.add(node.right);
            }
            i++;
        }
        return root;
    }
    private static int diameter=0;
    public static int diameterOfBinaryTree(Node root) {
        height(root);
        return diameter;
    }
    public static int height(Node node){
        if(node==null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        diameter = Math.max(diameter,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        String[] sa = s.split("\\s");
        int[] a = new int[sa.length];
        for(int i=0;i< a.length;i++){
            a[i]=Integer.parseInt(sa[i]);
        }
        root = create(a);
        System.out.println(diameterOfBinaryTree(root));
    }
}