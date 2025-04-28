import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class rightviewTree {
    static Tnode create(String input){
        String[] values = input.split(" ");
        if (values.length == 0) {
            return null;
        }

        Queue<Tnode> q = new LinkedList<>();
        Tnode root = new Tnode(Integer.parseInt(values[0]));
        int index = 1;
        q.add(root);
        while(!q.isEmpty() && index < values.length) {
            Tnode curr = q.poll();
            if (!values[index].equals("N")) {
                Tnode lnode = new Tnode(Integer.parseInt(values[index]));
                curr.left = lnode;
                q.add(lnode);
            }
            index++;
            if (index < values.length && !values[index].equals("N")) {
                Tnode rnode = new Tnode(Integer.parseInt(values[index]));
                curr.right = rnode;
                q.add(rnode);
            }
            index++;
        }
        return root;
    }


    static void rightView(Tnode root, ArrayList<Integer> al, int level){
        if(root == null){
            return;
        }
        if (level == al.size()) {
            al.add(root.data);
        }
        rightView(root.right, al, level + 1);
        rightView(root.left, al, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Tnode root = create(input);
        ArrayList<Integer> al = new ArrayList<>();
        rightView(root, al, 0);
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+ " ");
        }
    }
}
