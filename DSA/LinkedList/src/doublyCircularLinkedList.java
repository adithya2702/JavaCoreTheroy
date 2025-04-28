import java.util.Scanner;

class CDnode {
    int data;
    CDnode next;
    CDnode prev;

    CDnode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class doublyCircularLinkedList {
    private CDnode head;

    public doublyCircularLinkedList() {
        head = null;
    }

    public void insertFront(int data) {
        CDnode newNode = new CDnode(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            CDnode last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertRear(int data) {
        CDnode newNode = new CDnode(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            CDnode last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
        }
    }

    public void insertMiddle(int pos, int data) {
        if (pos <= 0) {
            insertFront(data);
            return;
        }
        CDnode newNode = new CDnode(data);
        CDnode temp = head;
        for (int i = 1; temp.next != head && i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void deleteFront() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        CDnode last = head.prev;
        head = head.next;
        head.prev = last;
        last.next = head;
    }

    public void deleteRear() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        CDnode last = head.prev;
        CDnode secondLast = last.prev;
        secondLast.next = head;
        head.prev = secondLast;
    }

    public void deleteMiddle(int pos) {
        if (head == null || pos <= 0) {
            return;
        }
        if (pos == 1) {
            deleteFront();
            return;
        }
        CDnode temp = head;
        for (int i = 1; temp.next != head && i < pos; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public void display() {
        if (head == null) {
            return;
        }
        CDnode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyCircularLinkedList list = new doublyCircularLinkedList();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.insertRear(ele);
        }
        list.display();

        System.out.println("Enter the position at which the element should be inserted: ");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert in front: ");
        int ele = sc.nextInt();
        list.insertMiddle(pos, ele);
        list.display();

        System.out.println("Deleting front element...");
        list.deleteFront();
        list.display();

        System.out.println("Deleting rear element...");
        list.deleteRear();
        list.display();

        System.out.println("Enter the position of the element to delete from the middle: ");
        pos = sc.nextInt();
        list.deleteMiddle(pos);
        list.display();
    }
}
