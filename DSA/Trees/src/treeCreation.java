import java.util.Scanner;

class treeCreation{
    public treeCreation(){
    }
    private static class node{
        int value;
        node left,right;
        node(int data){
            this.value = data;
        }
    }
    private static node root;

    //Insert elements
    public void create(Scanner sc){
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        root = new node(val);
        create(sc,root);
    }
    public void create(Scanner sc,node root){
        System.out.println("Do you want to insert left of "+root.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value");
            int val = sc.nextInt();
            root.left =  new node(val);
            create(sc,root.left);
        }
        System.out.println("Do you want to insert right of  "+root.value );
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value");
            int val = sc.nextInt();
            root.right =  new node(val);
            create(sc,root.right);
        }
    }
    public void display(){
       display(root," ");
    }
    private void display(node root,String s){
        if(root == null ) return;
        System.out.println(root.value+"  ");
        display(root.left,s+"\t");
        display(root.right,s+"\t");
    }
    public void treeDisplay(){
        treeDisplay(root,0);
    }
    private void treeDisplay(node root,int level){
        if(root==null) return;
        treeDisplay(root.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+root.value);
        }
        else{
            System.out.println(root.value);
        }
        treeDisplay(root.left,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        treeCreation tree  = new treeCreation();
        tree.create(sc);
        tree.display();
        tree.treeDisplay();
    }
}