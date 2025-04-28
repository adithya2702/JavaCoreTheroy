import java.util.Scanner;
public class validateBST {
    static Tnode root =null;
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
        while(sc.hasNextLine()){

        }
        int min= Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        CBST(root,min,max);
    }
}
