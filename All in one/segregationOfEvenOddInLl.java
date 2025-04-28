import java.util.Scanner;

class SegList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    void insert(int n) {
        Node newnode = new Node(n);
        if (head == null)
            head = newnode;
        else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newnode;
        }
    }

    void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.print("null");
    }

    void seg() {
        Node es = null;
        Node ee = null;
        Node os = null;
        Node oe = null;
        Node cur = head;
        while (cur != null) {
            if (cur.data % 2 == 0) {
                if (es == null)
                    es = ee = cur;
                else {
                    ee.next = cur;
                    ee = cur;
                }
            }
            else {
                if (os == null)
                    os = oe = cur;
                else {
                    oe.next = cur;
                    oe = cur;
                }
            }
            cur = cur.next;
        }
        if (es == null)
            head = os;
        else {
            head = es;
            ee.next = os;
        }
        if (oe != null)
            oe.next = null;
    }
}

class SegregationOfEvenOddInLl {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SegList l = new SegList();
        for (int i = 0; i < n; i++) {
            l.insert(sc.nextInt());
        }
        l.display();
        l.seg();
        System.out.println();
        l.display();
    }
}
