import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    private static Node head = null;

    public static void add(int n) {
        if (head == null) {
            head = new Node(n);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(n);
        }
    }

    public static int length(Node head) {
        int count=0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void reversek(int k) {

    }

    public static void display() {
        if (head == null) {
            System.out.println(-1);
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            add(n);
        }
        int k = sc.nextInt();
        reversek(k);
        display();
    }
}