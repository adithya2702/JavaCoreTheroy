
import java.util.Scanner;
public class zigzagTraversalTree {
    static Tnode root = null;
    static int depth =0;
    static Tnode binaryTreeIns(Tnode root ,int data){
        if(root ==  null){
            Tnode newnode = new Tnode (data);
            root = newnode;
            return root;
        }
        else if(root.left==null){
            root.left = binaryTreeIns(root.left,data);
        }
        else if(root.right==null){
            root.right= binaryTreeIns(root.right, data);
        }
        else{
            root.left= binaryTreeIns(root.left,data);
        }
        return root;
    }
    static void inorder(Tnode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    static void zigzag(Tnode root, int l) {
        int n = (int) (Math.log(l + 1) / Math.log(2));
        if (root == null)
            return;
        System.out.print(root.data + " ");
        depth++;
        for (int i = 0; i < n; i++) {
            if (depth % 2 == 1) {
                if (root.right != null) {
                    System.out.print(root.right.data + " ");
                }
                if (root.left != null) {
                    System.out.print(root.left.data + " ");
                }
                depth++;
                root = root.left;
            } else if (depth % 2 == 0) {
                if (root.left != null) {
                    System.out.print(root.left.data + " ");
                }
                if (root.right != null) {
                    System.out.print(root.right.data + " ");
                }
                depth++;
                root = root.right;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        int [] a = new int[s.length];
        for(int i=0; i<s.length; i++){
            a[i] = Integer.parseInt(s[i]);
        }
        if(a.length<1 && a.length>10000) {
            System.out.println("size reached max");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                root = binaryTreeIns(root, a[i]);
            }
            inorder(root);
//            zigzag(root, a.length);
        }
    }
}