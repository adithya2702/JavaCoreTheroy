import java.util.Scanner;
public class reverseKLL {
    static Node head = null;
    static int nodeCount = 0;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node append(int n) {
        if (nodeCount >= 100 || n < -1 || n > 100) {
            return head;
        }

        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        nodeCount++;
        return head;
    }
    static void display() {
        Node temp = head;
        if(head!=null) {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    static Node reverseK(Node head, int s) {
        if (s < -1 || s > 100) {
            return head;
        }

        if (head == null) {
            return null;
        }
        Node curr = head;
        Node nnext = null;
        Node prev = null;
        int c = 0;
        while (c < s && curr != null) {
            nnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nnext;
            c++;
        }
        if (c < s) {
            curr = prev;
            prev = null;
            while (curr != null) {
                nnext = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nnext;
            }
            return prev;
        }
        else if (nnext != null) {
            head.next = reverseK(nnext, s);
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != -1) {
            n = sc.nextInt();
            if (n != -1) {
                append(n);
            }
        }
        int s = sc.nextInt();
        head = reverseK(head, s);
        display();
    }
}
