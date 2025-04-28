import java.util.*;
class Tnode{
    int data;
    Tnode right, left;
    Tnode(int data){
        this.data = data;
        this .left = null;
        this.right = null;
    }
}
public class binaryTree {
    static Tnode root = null;
    static Tnode create(){
        Scanner sc = new Scanner(System.in);
        Queue<Tnode> q = new LinkedList<>();
        int d = sc.nextInt();
        if(d==-1){
            return null;
        }
        Tnode newnode = new Tnode(d);
        root = newnode;
        q.add(root);
        while(!q.isEmpty()) {
            Tnode curr = q.poll();
            int ld = sc.nextInt();
            if (ld != -1) {
                Tnode lnode = new Tnode(ld);
                curr.left = lnode;
                q.add(lnode);
            }
            int rd = sc.nextInt();
            if(rd != -1){
                Tnode rnode = new Tnode(rd);
                curr.right = rnode;
                q.add(rnode);
            }
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
    static int sumnodes(Tnode root){
        if(root == null){
            return 0;
        }
        return root.data+sumnodes(root.left)+sumnodes(root.right);
    }
    static int sumLeafnodes(Tnode node){
        if(node== null){
            return 0;
        }
        if(node.left==null && node.right== null){
            return node.data;
        }
        return sumLeafnodes(node.left) + sumLeafnodes(node.right);
    }
    static ArrayList<Integer> rightview(Tnode root,ArrayList<Integer> al,int lev){
        if(root == null){
            return al;
        }
        if (lev == al.size()) {
            al.add(root.data);
            lev++;
        }
        rightview(root.right,al,lev);
        rightview(root.left,al,lev);
        return al;
    }
    static int sumRootToLeaf(Tnode root,int sum){
        if(root == null){
            return 0;
        }
        sum = sum *10+root.data;
        if(root.left == null && root.right == null){
            return sum;
        }
        return sumRootToLeaf(root.left,sum)+ sumRootToLeaf(root.right,sum);
    }
    static Tnode binarySearch(Tnode root,int data){
        if(root == null){
            Tnode newnode = new Tnode(data);
            root = newnode;
            return root;
        }
        if(data<root.data){
            root.left = binarySearch(root.left, data);

        }
        if(data>root.data){
            root.right = binarySearch(root.right,data);
        }
        return root;
    }

    static boolean CBST(Tnode root,int min, int max){
        if(root == null){
            return true;
        }
        else if (root.data>max || root.data<min){
            return false;
        }
        return CBST(root.left,min,root.data) && CBST(root.right,root.data,max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Tnode h = create();
        inorder(h);

        System.out.println();
        System.out.println(sumnodes(h));
        System.out.println(sumLeafnodes(h));
//
        ArrayList<Integer> al = new ArrayList<>();
        rightview(h,al,0);
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+ " ");
        }

        int n= sc.nextInt();
        for(int i=0; i<n; i++) {
            int d = sc.nextInt();
            root = binarySearch(root,d);
        }
        inorder(root);

        int min= Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        CBST(root,min,max);
    }
}