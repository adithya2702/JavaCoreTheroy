import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class invertBT {
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
    public static Node invert(Node root){
        if(root==null||root.left==null && root.right==null) return root;
        Node left = invert(root.left);
        Node right = invert(root.right);
        root.left = right;
        root.right = left;
        return root;
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
        root = invert(root);
    }
}
