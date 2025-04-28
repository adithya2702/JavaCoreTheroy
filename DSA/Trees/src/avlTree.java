public class avlTree {
    private static class Node{
        private int data;
        private int height;
        private Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    private Node root;
    public int height(Node node){
        if(node==null) return -1;
        return node.height;
    }
    public void insert(int val){
        root = insert(root,val);
    }
    public Node insert(Node node,int val){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(node.data>val){
            node.left = insert(node.left,val);
        }
        if(node.data<val){
            node.right = insert(node.right,val);
        }
        node.height = Math.max(height(node.left),height(node.right)+1);
        return rotate(node);
    }
    public Node rotate(Node node){
        if(height(node.left)-height(node.right)>1 && height(node.left.left)-height(node.left.right)>0){
            return rightRotate(node);
        }
        if(height(node.left)-height(node.right)>1 && height(node.left.left)-height(node.left.right)<0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if(height(node.right)-height(node.left)>1 && height(node.right.right)-height(node.right.left)>0){
            return leftRotate(node);
        }
        if(height(node.right)-height(node.left)>1 && height(node.right.right)-height(node.right.left)<0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    /*Refer the diagram in book to get clarity
        p-parent
        c-child
        g-grandchild
     */
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return p;
    }
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return c;
    }
    public void display(){
        display(root,"Root Node: ");
    }
    public void display(Node node,String details){
        if(node == null) return;
        System.out.println(details+node.data);
        display(node.left,"Left node of "+node.data+" : ");
        display(node.right,"Right node of "+node.data+" : ");
    }
    public void populate(int[] a){
        for(int i=0;i<a.length;i++){
            insert(a[i]);
        }
    }
    public boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left)-height(node.right))<=1  && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        avlTree tree = new avlTree();
        for(int i=0;i<10;i++){
            tree.insert(i);
        }
        tree.display();
    }
}