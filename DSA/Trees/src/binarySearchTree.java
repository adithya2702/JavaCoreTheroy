import java.util.Arrays;

public class binarySearchTree {
    private static class node{
        private int height;
        private int data;
        private node left,right;
        node(int data){
            this.data=data;
        }
    }
    private static node root;
    public int height(node temp){
        if(temp==null) return -1;
        return temp.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void create(int val){
        root = create(root,val);
    }
    public node create(node newnode,int val){
        if(newnode==null){
            newnode =new node(val);
            return newnode;
        }
        if(val<newnode.data){
            newnode.left = create(newnode.left,val);
        }
        if(val>newnode.data){
            newnode.right = create(newnode.right,val);
        }
        newnode.height = Math.max(height(newnode.left),height(newnode.right))+1;
        return newnode;
    }
    public void display(){
        display(root,"Root Node: ");
    }
    public void display(node root,String details){
        if(root==null) return;
        System.out.println(details+root.data);
        display(root.left,"Left child of "+root.data+" : ");
        display(root.right,"Right child of "+root.data+" : ");
    }
    public void populate(int []a){
        for(int i=0;i<a.length;i++){
            this.create(a[i]);
        }
    }
    public void preorder(){
        preorder(root);
    }
    public void preorder(node newnode){
        if(newnode == null) return;
        System.out.print(newnode.data +" ");
        preorder(newnode.left);
        preorder(newnode.right);
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(node newnode){
        if(newnode == null) return;
        inorder(newnode.left);
        System.out.print(newnode.data+" ");
        inorder(newnode.right);
    }
    public void postorder(){
        postorder(root);
    }
    public void postorder(node newnode){
        if(newnode == null) return;
        postorder(newnode.left);
        postorder(newnode.right);
        System.out.print(newnode.data +" ");
    }

    //If it is sorted array we can use AVL or the below method
    public boolean balanced(node newnode){
        if(newnode==null) return true;
        return Math.abs(height(newnode.left)-height(newnode.right))<=1 && balanced(newnode.left) && balanced(newnode.right);
    }
    public void populateSorted(int[] a){
        populateSorted(a,0,a.length);
    }
    public void populateSorted(int []a,int start,int end){
        if(start>=end) return;
        int mid = start+(end-start)/2;
        this.create(a[mid]);
        populateSorted(a,start,mid);
        populateSorted(a,mid+1,end);
    }

    public static void main(String[] args) {
        binarySearchTree BST = new binarySearchTree();
        int [] a = {5,2,7,1,4,6,9,8,3,10};
        BST.populate(a);
        BST.display();
        BST.preorder();
        System.out.println();
        BST.inorder();
        System.out.println();
        BST.postorder();
        System.out.println();
        Arrays.sort(a);
        BST.populateSorted(a);
        BST.display();
    }
}
/*
    * To delete a try we use post order to save the memory wastage and memory leak.
    * To find the smallest element  and ascending we use inorder.
    * To something at that level and move down then preorder.
 */