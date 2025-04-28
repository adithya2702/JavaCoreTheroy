import java.util.Scanner;
public class lastFirstLL {
    static node head = null;

    static node append(int n) {
        node newnode = new node(n);
        if (head == null) {
            head = newnode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        return head;
    }

    static node reverse(node head) {
        node cur = head;
        node nnext = null;
        node prev = null;
        while (cur != null) {
            nnext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nnext;
        }
        head = prev;
        return head;
    }

    static void lastFirst() {
        node fast = head;
        node slow = head;
        node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) { // List length is odd
            prev = slow;
            slow = slow.next;
        }

        prev.next = null; // Split the list into two halves

        node h1 = reverse(slow);
        node temp = head;
        while (h1 != null || temp != null) {
            if (h1 != null) {
                System.out.print(h1.data + " ");
                h1 = h1.next;
            }
            if (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            append(sc.nextInt());
        }
        lastFirst();
    }
}
