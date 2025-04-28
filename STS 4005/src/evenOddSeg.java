import java.util.*;
public class evenOddSeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
            if (num % 2 == 0) {
                evenList.add(num);
            }
            else {
                oddList.add(num);
            }
        }
        list.clear();
        list.addAll(evenList);
        list.addAll(oddList);
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}