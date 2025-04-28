import java.util.Scanner;
public class diameterBST {
    static Tnode  root = null;
    static int c =0;
    static Tnode BST(Tnode root,int data){
        if(root == null){
            c++;
            Tnode newnode = new Tnode(data);
            root = newnode;
            return root;
        }
        if(data<root.data){
            root.left = BST(root.left, data);
        }
        if(data>root.data){
            root.right = BST(root.right,data);
        }
        return root;
    }
    static void inorder(Tnode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=0;
        while(n != -1){
            n = sc.nextInt();
            if (n != -1) {
                root = BST(root,n);
            }
        }
        System.out.println(c);
    }
}