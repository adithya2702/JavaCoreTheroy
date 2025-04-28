import java.util.Scanner;
import java.util.ArrayList;
public class kSmallestEleBST {
    static Tnode root = null;

    static Tnode binarySearch(Tnode root, int data) {
        if (root == null) {
            Tnode newnode = new Tnode(data);
            root = newnode;
            return root;
        }
        if (data < root.data) {
            root.left = binarySearch(root.left, data);

        }
        if (data > root.data) {
            root.right = binarySearch(root.right, data);
        }
        return root;
    }

    static void ksmallest(Tnode root,ArrayList<Integer> al ){
        if (root == null) {
            return;
        }
        ksmallest(root.left,al);
        al.add(root.data);
        ksmallest(root.right,al);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != -1) {
            n = sc.nextInt();
            if(n!= -1) {
                root = binarySearch(root, n);
            }
        }
        int k = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        ksmallest(root,al);
        for(int i=0; i<k; i++){
            if(i==k-1){
                System.out.println(al.get(i));
            }
        }
    }
}
