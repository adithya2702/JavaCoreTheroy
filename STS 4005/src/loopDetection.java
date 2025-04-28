import java.util.*;
public class loopDetection {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node node) {
        HashSet<Node> s = new HashSet<>();
        while (node != null) {
            if (s.contains(node))
                return true;
            s.add(node);
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        loopDetection llist = new loopDetection();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        // Uncommented to remove the loop
        llist.head.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop Exists");
        else
            System.out.println("Loop doesn't exist");
    }
}
