/* Segment trees means which have interval info and operation we perform because generally these perform takes O(n) time by using this we can do in O(log n) time but it takes some space
 * Segment tree is full binary tree
 * Leaf nodes = n
 * Internal nodes = n-1
 * Total nodes = 2n-1
 */
public class segmentTree {
    public static void main(String[] args) {
        int[] a = {3,8,6,7,-2,-8,4,9};
        segmentTree tree =new segmentTree();
        tree.construct(a);
        tree.display();
        System.out.println(tree.query(1,6));
    }
    private static class Node{
        private int data;
        private int start,end;
        private Node left,right;
        Node(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    private Node root;
    public void construct(int[] a){
        this.root = construct(a, 0, a.length - 1);
    }
    public Node construct(int[] a,int start,int end){
        if(start==end){
            Node leaf = new Node(start,end);
            leaf.data = a[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.left = construct(a,start,mid);
        node.right = construct(a,mid+1,end);
        node.data = node.right.data+node.left.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        if (node.left != null) {
            str += "Interval=[" + node.left.start + "-" + node.left.end + "] and data: " + node.left.data + " => ";
        } else {
            str += "No left child => ";
        }

        str += "Interval=[" + node.start + "-" + node.end + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str += "Interval=[" + node.right.start + "-" + node.right.end + "] and data: " + node.right.data + " => ";
        } else {
            str += "No right child";
        }
        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        if(node.start>=qsi && node.end<=qei){
            return node.data;
        }
        if(node.start>qei || node.end<qsi){
            return 0;
        }
        else{
            return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }
    }
    public void update(int index,int val){
        this.root.data = update(root,index,val);
    }
    private int update(Node node,int index,int val){
        if(index>=node.start && index<=node.end) {
            if (index == node.start && index == node.end) {
                node.data = val;
                return node.data;
            } else {
                int leftAns = update(node.left, index, val);
                int rightAns = update(node.right, index, val);

                node.data = leftAns + rightAns;
                return node.data;
            }

        }
        return node.data;
    }
}